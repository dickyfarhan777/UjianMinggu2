package com.juaracodingg;

public class BankAccount {

    int acc_no;
    String name;
    double amount;

    public void setAccount(int acc_no, String name, double amount){
        setAccNo(acc_no);
        setName(name);
        setAmount(amount);
    }
    public void setAccNo(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }


    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }

    public void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    public void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}
