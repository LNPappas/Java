package Java_Assignment_4_Classes.Java_Assignment_4_Classes.src.four;

// Write a class named ConstructorPerson that declares name (String) and age (int) instance variables. Write
// a no-arg constructor1
// that initializes ConstructorPerson with default values. In a Main class, create an
// instance of a ConstructorPerson and print its properties name and age.
// Place these files in a package named, “four”.

public class ConstructorPerson {

    private String name;
    private int age;

    public ConstructorPerson(){
        this.name = "None";
        this.age = -1;
    }

    public ConstructorPerson(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    
}