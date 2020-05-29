package com.mycompany.main;

// Write a class named AbstractClass and declare it abstract. It should have an abstract method run().
// Declare another class ConcreteClass and it should extend AbstractClass. Implement the run() method.
// In the Application class, add a statement to create an instance of ConcreteClass and then call the run()
// method.

public class ConcreteClass extends AbstractClass{

    @Override
    public void run(){
        System.out.println("running...");
    }
    
}