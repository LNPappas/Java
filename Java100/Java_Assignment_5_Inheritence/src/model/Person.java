package model;

    // Write a class named Person that declares instance variables name (String) and age(int); they should be
    // marked protected. Create a default no-arg constructor for Person. Create another class named
    // AwesomePerson that extends Person. AwesomePerson should declare a method talk() that prints its name
    // and age properties. AwesomePerson should also have its own default, no-arg constructor.
    // In an Application class, instantiate an AwesomePerson and call its talk() method.
    // Place the Person and AwesomePerson in the package, model. Place the Application.java file in the
    // package, main.

public class Person {


    protected String name;
    protected int age;

    public Person (){
        name = "None";
        age = -1;
    }
    public Person(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }    
}