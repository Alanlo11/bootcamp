import java.util.LinkedList;
import java.util.List;

public class Bank {
 private List<Account> accounts;
 private String address;

 public Bank(){
  this.accounts = new LinkedList<>();
 }

 public void addAccount(Account account){
  accounts.add(account);
 }

 private static void creditAccount(double amount){
  new Account().credit(amount);
 }


 public static class Account{ //private ? 
  private static int number = 0;
  private int acctNo;
  private double balance;

    public Account(){
      this.acctNo = ++number;
    }



    public int getAccNo(){
      return this.acctNo;
    }

    public void credit(double amount){
      this.balance += amount;
    }

    public void print(){
      // this.address; / you cannot access the outer class instance variable
    }

 }

 public static void main(String[] args) {
  Bank bank = new Bank();
  Bank.Account account = new Bank.Account();
  
 }
}
