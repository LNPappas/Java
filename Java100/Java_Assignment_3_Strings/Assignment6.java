package Java_Assignment_3_Strings;

// Write a class named Assignment6 that finds the index of the 2nd space character in "Hello My Name is
// Java"; Print this number. (Hint: you may have to combine two String methods)


public class Assignment6 {
    public static void main(String[] args) {
        String s = "Hello my name is Java";
        System.out.println(s.indexOf(' ', s.indexOf(' ') + 1));
    }
}