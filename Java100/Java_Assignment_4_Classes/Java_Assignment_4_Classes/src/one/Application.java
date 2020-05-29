package Java_Assignment_4_Classes.Java_Assignment_4_Classes.src.one;

// Write a class named Person. The person class should define a name (String) and age (int) instance
// variables. Write another class, Application, in which you instantiate a new Person object. Set the person’s
// age and name properties. Print the age and name properties of the created person. Place these files in a
// package named, “one”.
// Note: The Person.java file should NOT declare a main() method. 


public class Application {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        p.age = 47;
        System.out.println("Name: " + p.name + ", Age: " + p.age);
    }
    
}