package Steps;

public class BankAccount {
    private double balance;

    BankAccount(){
        this.balance = 0;
    }

    BankAccount(double solde){
        this.balance = solde;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount>balance){
            throw new IllegalArgumentException("Not enough money");
        }
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }
}
