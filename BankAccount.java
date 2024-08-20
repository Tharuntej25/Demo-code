class BankAccount {
    String accountNumber;
    double balance;
    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    void deposit(double amount) {
        balance += amount;
    }
    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    void displayBalance() {
        System.out.println("Final Balance: " + balance);
    }
}

public class Solution {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 500.00);
        account.deposit(200.00);
        account.withdraw(100.00);
        account.displayBalance();
    }
}
