package Java_Assignment_3_Strings;

// Write a class named Assignment4 that declares a string "abcdefghijklmnopqrstuvwxyz". Use the
// indexOf() method to print the index of "s" and "f".

public class Assignment4 {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        System.out.printf("%d %d", s1.indexOf("s"), s1.indexOf("f"));
    }
    
}