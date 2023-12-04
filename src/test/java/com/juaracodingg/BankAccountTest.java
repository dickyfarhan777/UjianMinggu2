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
    @Test (groups = "deposit")
    public void testDepositDenganNolAmount() {
        double newDeposit = bankaccount.deposit(0.00);
        Assert.assertEquals(bankaccount.getAmount(), 50000.0);
        System.out.println(newDeposit);
    }

    @Test (priority = 0)
    public void testDeposit() {
        bankaccount.deposit(20000);
        Assert.assertEquals(bankaccount.getAmount(), 70000);//deposited
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
    }
    @Test (groups = "withdraw")
    public void testWithdrawDenganNolAmount() {
        bankaccount.withdraw(0.0);
        Assert.assertEquals(bankaccount.getAmount(), 50000.0, 0.01);
    }

    @Test (groups = "set")
    public void testSetAccNo() {
        bankaccount.setAccNo(2);
        Assert.assertTrue(bankaccount.getAcc_no()<=2);
        System.out.println(bankaccount.getAcc_no());
    }

    @Test (groups = "set")
    public void testSetName(){
        bankaccount.setName("Dono Kasino");
        Assert.assertEquals(bankaccount.getName().length(), 11);
        System.out.println(bankaccount.getName().length());

    }
    @Test (groups = "set")
    public void testSetAmount(){
        bankaccount.setAmount(100000.00);
        Assert.assertEquals(bankaccount.getAmount(), 100000.0);

    }


    @Test (priority = 0)
    public void testCheckBalance() {
        double balance = bankaccount.checkBalance();
        Assert.assertEquals(balance, 50000.0);
        System.out.println(bankaccount.checkBalance());
    }
    @Test (priority = 0)
    public void testDisplay() {
        String bankaccountDetails = bankaccount.display();
        Assert.assertEquals(bankaccountDetails, "1 DickyF 50000.0");
    }

}
