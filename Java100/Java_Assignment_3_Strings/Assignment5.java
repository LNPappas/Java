package Java_Assignment_3_Strings;

// Write a class named Assignment5 that uses the substring() method to print the last 5 characters of
// "Hello My Name is Java".

public class Assignment5 {
    public static void main(String[] args) {
        String s = "Hello My Name is Java";
        System.out.println(s.substring(s.length() - 5));
    }
    
}