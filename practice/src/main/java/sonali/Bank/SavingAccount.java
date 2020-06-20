package sonali.Bank;

import java.io.InputStream;
import java.util.Scanner;
import java.util.*;


public class SavingAccount {
    double Balance;
    double CurrentBalance;
    double Interest;
    double DAmount;

    public void SavingAccount()
    {
        Balance=0;
        CurrentBalance=0;
        Interest=0;

    }
    public void SavingAccount(double balance,double interest)
    {
        Balance=balance;
        Interest=interest;
    }
    public void Amount()
    {
        System.out.println("Saving amount is : " + Balance);
    }
    public void GetInterest()
    {
        Interest=Balance*5*1/100;
        System.out.println("Interest on savings : "+Interest);
    }
    public void CurrentBalance()
    {
        CurrentBalance=Interest+Balance;
        System.out.println("Current Balance is : "+CurrentBalance);
    }
    public void Deposit(double amount)
    {
        DAmount=amount;
        Balance=CurrentBalance+amount;
        System.out.println("You deposited : "+DAmount);
        System.out.println("Now your current balance is : "+Balance);
    }


}
