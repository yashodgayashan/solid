package com.mycompany.dip;

public class ShoppingMall {
  
  private BankCard bankCard;
  
  public ShoppingMall(BankCard bankCard) {
    this.bankCard = bankCard;
  }
  
  public void doShopping(double amount) {
    bankCard.makePayment(amount);
  }

  public static void main(String[] args) {
    BankCard bankCard = new CreditCard();
    ShoppingMall shoppingMall = new ShoppingMall(bankCard);
    shoppingMall.doShopping(1000);
  }
}
