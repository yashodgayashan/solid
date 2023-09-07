## Interface Segregation Principle

### Definition

The interface-segregation principle (ISP) states that no client should be forced to depend on methods it does not use.

### Scenario

There is a BankService which can deposit, withdraw, printPassbook, getLoanInterestInfo and sendOTP. PrintPassbook and sendOTP are not related to Bank Service. So, we can create two separate interfaces for these two functionalities.

```java

public interface BankService {
    long deposit(long amount, String accountNumber);

    long withdraw(long amount, String accountNumber);

    void getLoanInterestInfo(String loanType);
}

public interface PassbookService {
    void printPassbook();
}

public interface OTPService {
    void sendOTP(String medium);
}

public class BankServiceImpl implements BankService, PassbookService, OTPService {
    @Override
    public long deposit(long amount, String accountNumber) {
        // deposit logic
        return 0;
    }

    @Override
    public long withdraw(long amount, String accountNumber) {
        // withdraw logic
        return 0;
    }

    @Override
    public void printPassbook() {
        // printPassbook logic
    }

    @Override
    public void getLoanInterestInfo(String loanType) {
        // getLoanInterestInfo logic
        if (loanType.equals("homeloan")) {

        } else if (loanType.equals("carloan")) {

        } else if (loanType.equals("personalloan")) {

        }
    }

    @Override
    public void sendOTP(String medium) {
        // sendOTP logic
        if (medium.equals("email")) {

        } else if (medium.equals("sms")) {

        }
    }
}
```
