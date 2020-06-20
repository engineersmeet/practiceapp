package sonali.Bank;
import java.util.*;


public class BankAccount {
    public static void main(String[] args)
    {
        SavingAccount Sa =new SavingAccount();
        Sa.SavingAccount(400,5);
        Sa.Amount();
        Sa.GetInterest();
        Sa.CurrentBalance();
        Sa.Deposit(1000);
    }

}
