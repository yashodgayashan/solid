## Single Responsibility Principle

### Definition

The single responsibility principle states that every module or class should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class.

### Scenario

There is a Bank Service which can deposit, withdraw, printPassbook, getLoanInterestInfo and sendOTP. PrintPassbook and sendOTP are not related to Bank Service. So, we can create two separate classes for these two functionalities.

```java
public class BankService {
    public long deposit(long amount, String accountNumber) {
        // deposit logic
        return 0;
    }

    public long withdraw(long amount, String accountNumber) {
        // withdraw logic
        return 0;
    }

    public void printPassbook() {
        // printPassbook logic
    }

    public void getLoanInterestInfo(String loanType) {
        // getLoanInterestInfo logic
        if (loanType.equals("homeloan")) {

        } else if (loanType.equals("carloan")) {

        } else if (loanType.equals("personalloan")) {

        }
    }

    public void sendOTP(String medium) {
        // sendOTP logic
        if (medium.equals("email")) {

        } else if (medium.equals("sms")) {

        }
    }
}
```
