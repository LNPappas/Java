package model;

    // Write a class named Person that declares instance variables name (String) and age(int); they should be
    // marked protected. Create a default no-arg constructor for Person. Create another class named
    // AwesomePerson that extends Person. AwesomePerson should declare a method talk() that prints its name
    // and age properties. AwesomePerson should also have its own default, no-arg constructor.
    // In an Application class, instantiate an AwesomePerson and call its talk() method.
    // Place the Person and AwesomePerson in the package, model. Place the Application.java file in the
    // package, main.

public class AwesomePerson extends Person{

    public AwesomePerson(){
        this.name = "Awesomely None";
        this.age = -2;
    }

    public AwesomePerson(final String newName, final int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    public void talk(){
        System.out.printf("Hello my name is %s and I am %d.\n", this.name, this.age);
    }
    
}