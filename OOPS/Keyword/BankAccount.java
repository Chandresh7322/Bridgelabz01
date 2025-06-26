package OOPS.Keyword;

public class BankAccount {
    String accountHolderName;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        System.out.println("accountHolderName" +accountHolderName);
        System.out.println("accountNumber" +accountNumber);
        System.out.println("balance" +balance);
    }
    
}
