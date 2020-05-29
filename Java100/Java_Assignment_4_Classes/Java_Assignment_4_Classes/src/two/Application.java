package Java_Assignment_4_Classes.Java_Assignment_4_Classes.src.two;

// Write a class named PrivatePerson. Declare instance variables name (String) and age (int) and mark them
// private. Write getter and setter methods to access these properties. In a Main class, create a new instance
// of Person and print its properties name and age. Place these files in a package named, “two”.


public class Application {
    public static void main(String[] args) {
        PrivatePerson p = new PrivatePerson();
        p.setName("Gladis");
        p.setAge(89);
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
    }
    
}