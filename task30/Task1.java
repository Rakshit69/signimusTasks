
//Create a banking system where multiple transactions occur, and rollback changes if a transaction fails in java

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //Create a banking system where multiple transactions occur, and rollback changes if a transaction fails.
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(200); // This should fail and rollback the previous transaction
        account.withdraw(200); // This should fail and rollback the previous transaction

    }
}
class Transaction {
    private int id;
    private String type;
    private double amount;

    Transaction(int id, String amount0,double amount) {
        this.id = id;
        this.type = amount0;
        this.amount = amount;

    }

    
}
class BankAccount {
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();
    private int transactionId = 1;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    //DEPOSIT AND WITHEDRAW
    public void deposit(double amount) {
        Transaction transaction = new Transaction(transactionId++, "Deposit", amount);
        transactions.add(transaction);
        balance += amount;
    }

    //WITHDRAW
    public void withdraw(double amount) {
        if (amount > balance) {
            // Rollback the previous transaction if the withdrawal fails
            for (int i = transactions.size() - 1; i >= 0; i--)
                transactions.remove(i);
            balance -= amount;
            System.out.println("Insufficient funds");
        } else {
            Transaction transaction = new Transaction(transactionId++, "Withdrawal", amount);
            transactions.add(transaction);
            balance -= amount;
        }
    }
}


