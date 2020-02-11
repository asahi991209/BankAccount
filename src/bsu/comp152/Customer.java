package bsu.comp152;
import java.util.ArrayList;

public class Customer {
    private ArrayList<BankAccount> accounts;
    private String name;
    private int customerID;

    public Customer(String name, int taxID){
        this.name = name;       /// if you wanna use the same same "name (this time)" add this in front
        accounts = new ArrayList<BankAccount>();
        customerID = taxID;

    }
    //create new bank account, apply it into a new account.
    public boolean openAccount(double initialDeposit){
        var newAccount = new BankAccount(initialDeposit, 0.03F);
        var success = accounts.add(newAccount);
        return success;

    }




}
