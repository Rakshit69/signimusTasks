package task25;

public class Task1 {
    public static void main(String[] args) {
        
    }
}
//Implement a banking system where multiple threads withdraw money from a shared account, ensuring that withdrawal does not exceed balance.

class BankAccount {
    private int balance;
    private final Object lock = new Object();

    public BankAccount(int balance) {
        this.balance = balance;
    }
    
}
