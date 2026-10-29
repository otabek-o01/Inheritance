package BankAccount;

public class SavingsAccount extends BankAccount2{
    public static void main(String [] args ){
        SavingsAccount sav = new SavingsAccount();

        sav.Balance = 1000.0000;
        sav.ShowBalance();
    }
}