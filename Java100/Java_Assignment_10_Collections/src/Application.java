import java.util.List;
import java.util.ArrayList;

// Write a class Account that declares an id (long) property and an accountType (String) property. Create
// a method that has the following signature:
// List<Account> createAccounts(int numAccounts).
// The method should create a number of Accounts equal to the numAccounts parameter and return those
// accounts in a List. For example, createAccounts(5) should create five instances of Account and return
// those in a List.
// In an Application class, call the createAccounts() and then loop through the returned List and print the
// ids of each Account. 

public class Application {

    public static void main(String[] args) {
        List<Account> l = Account.createAccounts(5);
        for(Account a : l){
            System.out.println(a.id);
            System.out.println(a.accountType);
        }
        
    }
    
}