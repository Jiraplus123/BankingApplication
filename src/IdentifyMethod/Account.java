package IdentifyMethod;

public class Account {
    private int Number;
    private String Name;
    private double balance;

    public Account(int Number, String Name, double balance) {
        this.Number = Number;
        this.Name = Name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.Number;
    }

    public String getName(){
        return this.Name;
    }
}
