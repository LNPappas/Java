package Java_Assignment_3_Strings;

import java.util.Arrays;

public class Assignment13 {

    public static String sortString(String inputString){
        char temp[] = inputString.toCharArray();
        Arrays.sort(temp);
        return new String(temp);

    }
    public static void main(String[] args) {

        String s1 = sortString("angel");
        String s2 = sortString("angle");
        String s3 = sortString("glean");

        System.out.println(s1.equals(s2) ? "angel is anagram of angle" : "angel not anagram of angle");
        System.out.println(s1.equals(s3) ? "angel is anagram of glean" : "angel not anagram of glean");
        System.out.println(s3.equals(s2) ? "angle is anagram of angle" : "angle not anagram of angle");

    }
    
}