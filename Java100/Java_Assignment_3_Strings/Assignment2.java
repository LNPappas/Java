package Java_Assignment_3_Strings;

// Write a class named Assignment2 that uses a 2 if-statement to compare the strings “abc” and “ABC”.
// The first if-statement should use the double equals (==) operator and the other that uses the .equals()
// method of one of the strings to compare to the other. Print a message in both if-statements to indicate
// that the strings are equal

public class Assignment2 {
    public static void main(String[] args) {
        String lower = "abc";
        String upper = "ABC";

        if (lower == upper){
            System.out.println("strings are ==");
        }
        else if (upper.equals(lower)){
            System.out.println("strings are equals()");
        }
        else if (upper.equalsIgnoreCase(lower)){
            System.out.println("strings are equalsIgnoreCase()");
        }
        else {
            System.out.println("strings are !=");
        }

    }
    
}