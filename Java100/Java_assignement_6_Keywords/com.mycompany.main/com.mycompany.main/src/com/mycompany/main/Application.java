package com.mycompany.main;

// Create a package com.mycompany.main to place your files in.
// Create a class named StaticClass. Write a static method that computes the sum of two floating point
// numbers. Use this method in an Application class, to compute the sum of two numbers that you pass to
// your static method.

public class Application {

    public static void main(String[] args) {
        System.out.println(StaticClass.sumFloat(12.5f, 7.54f));
    }
    
}