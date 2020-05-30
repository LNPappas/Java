import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Write a class Account that declares an id (long) property and an accountType (String) property. Create
// a method that has the following signature:
// List<Account> createAccounts(int numAccounts).
// The method should create a number of Accounts equal to the numAccounts parameter and return those
// accounts in a List. For example, createAccounts(5) should create five instances of Account and return
// those in a List.
// In an Application class, call the createAccounts() and then loop through the returned List and print the
// ids of each Account. 

public class Account{

    protected long id;
    protected String accountType;

    public Account(){
        Random r = new Random();
        this.id = r.nextInt(1000);
        this.accountType = "checking";
    }

    public static List<Account> createAccounts(int numAccounts){
        int i = 0;
        List<Account> l = new ArrayList();
        while (i<numAccounts){
            Account a = new Account();
            l.add(a);
            i++;
        }
        return l;
    }

}