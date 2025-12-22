public class BankAccount {

//    שדות:
private String owner;
private int balance;

public BankAccount(String owner,int balance){
    this.owner  =owner;
    this.balance=balance;
}
    //    מוסיפה כסף לחשבון
public void deposit(int amount){
   this.balance+=amount;
}

public boolean withdraw(int amount){
    boolean canWithdraw = false;
    if (this.balance>=amount){
        this.balance-=amount;
        canWithdraw =true;
    }
    System.out.println(this.balance);
    return canWithdraw;
  }

public void printBalance(){
    System.out.println(this.balance);
}

public String toString(){
    return "owner: " + this.owner + " balance: " + this.balance;
}
}
