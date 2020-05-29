package Java_Assignment_4_Classes.Java_Assignment_4_Classes.src.two;

// Write a class named PrivatePerson. Declare instance variables name (String) and age (int) and mark them
// private. Write getter and setter methods to access these properties. In a Main class, create a new instance
// of Person and print its properties name and age. Place these files in a package named, “two”.

public class PrivatePerson {

    private String name;
    private int age;

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