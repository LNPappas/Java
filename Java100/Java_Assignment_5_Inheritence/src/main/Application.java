package main;

import model.*;
    
    // Write a class named Person that declares instance variables name (String) and age(int); they should be
    // marked protected. Create a default no-arg constructor for Person. Create another class named
    // AwesomePerson that extends Person. AwesomePerson should declare a method talk() that prints its name
    // and age properties. AwesomePerson should also have its own default, no-arg constructor.
    // In an Application class, instantiate an AwesomePerson and call its talk() method.
    // Place the Person and AwesomePerson in the package, model. Place the Application.java file in the
    // package, main.

public class Application {

    public static void main(String[] args) {
        
        Person p = new Person("Kyle", 0);
        AwesomePerson ap = new AwesomePerson("Carly", 28);
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + "\n");
        ap.talk();
        System.out.println("Name: " + ap.getName() + ", Age: " + ap.getAge()+ "\n");

        ReallyAwesomePerson rap = new ReallyAwesomePerson("Jerry", 17);
        rap.talk();
    }
    
}