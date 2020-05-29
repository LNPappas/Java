package Java_Assignment_4_Classes.Java_Assignment_4_Classes.src.four;

// Write a class named ConstructorPerson that declares name (String) and age (int) instance variables. Write
// a no-arg constructor1
// that initializes ConstructorPerson with default values. In a Main class, create an
// instance of a ConstructorPerson and print its properties name and age.
// Place these files in a package named, “four”.

public class Application {
    public static void main(String[] args) {
        ConstructorPerson p1 = new ConstructorPerson();
        ConstructorPerson p2 = new ConstructorPerson("Harper", 22);
        System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge());
        System.out.println("Name: " + p2.getName() + ", Age: " + p2.getAge());

    }
    
}