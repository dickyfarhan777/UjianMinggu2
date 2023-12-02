package com.juaracodingg;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankAccountTest {

    BankAccount bankaccount;

    @BeforeMethod
    public void setUpAwal() {
        bankaccount = new BankAccount();
        bankaccount.setAccount(1, "DickyF", 50000);
    }

    @Test (priority = 0)
    public void testDeposit() {
        bankaccount.deposit(20000);
        Assert.assertEquals(bankaccount.getAmount(), 70000);//deposited
        System.out.println("===================Batas===================");
    }

    @Test(groups = "withdraw")
    public void testWithdraw() {
        bankaccount.withdraw(60000);
        Assert.assertEquals(bankaccount.getAmount(),50000);//Insufficient Balance
        System.out.println("===================Batas===================");
    }

    @Test(groups = "withdraw")
    public void testWithdraw2() {
        bankaccount.withdraw(40000);
        Assert.assertEquals(bankaccount.getAmount(), 10000);//withdrawn
        System.out.println("===================Batas===================");
    }

    @Test (groups = "set")
    public void testSetAccNo() {
        bankaccount.setAccNo(2);
        Assert.assertTrue(bankaccount.getAcc_no()<=2);
        System.out.println(bankaccount.getAcc_no());
        System.out.println("===================Batas===================");
    }

    @Test (groups = "set")
    public void testSetName(){
        bankaccount.setName("Dono Kasino");
        Assert.assertEquals(bankaccount.getName().length(), 11);
        System.out.println(bankaccount.getName().length());
        System.out.println("===================Batas===================");
    }
    @Test (groups = "set")
    public void testSetAmount(){
        bankaccount.setAmount(100000.00);
        System.out.println(bankaccount.getAmount());
        System.out.println("===================Batas===================");
    }
    @Test (groups = "get")
    public void testGetAccNo(){
        bankaccount.getAcc_no();
        System.out.println(bankaccount.getAcc_no());
        System.out.println("===================Batas===================");
    }

    @Test(groups = "get")
    public void testGetName(){
        bankaccount.getName();
        System.out.println(bankaccount.getName());
        System.out.println("===================Batas===================");
    }


    @Test (groups = "get")
    public void testGetAmount(){
        bankaccount.getAmount();
    System.out.println(bankaccount.getAmount());
    System.out.println("===================Batas===================");
    }

    @Test (priority = 0)
    public void testCheckBalance() {
        bankaccount.checkBalance();
        System.out.println("===================Batas===================");
    }
    @Test (priority = 0)
    public void testDisplay(){
        bankaccount.display();
        System.out.println("===================Batas===================");
    }

    @Test (groups = "Withdraw")
    public void testWithdraw3(){
        bankaccount.withdraw(2000);
        System.out.println(bankaccount.withdraw(50000));
    }


}
