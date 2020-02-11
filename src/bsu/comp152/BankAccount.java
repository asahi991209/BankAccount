package bsu.comp152;

public class BankAccount {
    private double balance;
    private float interestRate;
    private int accountID;
    private static int nextID = 1000;

    public BankAccount(){
        interestRate = 0.02f;
        accountID = nextID;
        nextID = nextID + 10;

    }


    public BankAccount(double initialBalance, float initialRate){
        balance = initialBalance;
        interestRate = initialRate;
        accountID = nextID;
        nextID++;
    }

    // void means this function does not return anything.
    // Such as "print" which just shows what is written but nothing to be returned.

    public void deposit(double amount){    ///mutator method ( any regular method that changes the value of a private instance variables
        balance = balance + amount;

    }

    public double checkBalance(){   /// accessor method  ( any method that retrieves the value of a private instance variable.)
        return balance;
    }

    public double addInterest(){    /// mutator method
        var interest = balance * interestRate;
        balance = balance + interest;
        return balance;

    }

    public boolean withdraw(double amount){   /// mutator method
        if (amount <= balance){
            balance -= amount;
            return true;

        }
        return false;
    }

    public int getAccountID(){
        return accountID;

    }


}
