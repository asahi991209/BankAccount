package bsu.comp152;

public class Main {

    public static void main(String[] args) {
    var myaccount = new BankAccount();
    var yourAccount = new BankAccount(10000,0.04f);
    myaccount.deposit(1000);
    myaccount.addInterest();
    yourAccount.addInterest();
    var succeeded = myaccount.withdraw(2000);
    if (succeeded)
        System.out.println("Yes! I withdrew 2000");
    else
        System.out.println("couldn't withdraw 2000 from account" + myaccount.getAccountID() + " when you only have "+
                myaccount.checkBalance()+ "in your account");

    System.out.println("Your account with ID  " + yourAccount.checkBalance());
    yourAccount.withdraw(5000);
    System.out.println("After paying the bills you have "+ myaccount.checkBalance() + " has " + yourAccount.checkBalance());

///null in java is a reference to an object which does not exist
///if you need to see if an object exists in java,
///string name; if (name == null) and make something inside.

//    yourAccount.deposit(3000);
//    yourAccount.withdraw(2000);
    }


}

/// do not make the parameter name as same as







