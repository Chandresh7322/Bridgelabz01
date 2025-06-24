package OOPS;
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Priya Sharma";
        acc.accountNumber = "SB1001";
        acc.balance = 5000.00;

        acc.deposit(1500);
        acc.withdraw(2000);
        acc.displayBalance();
    }
}
