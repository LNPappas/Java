package Java_Assignment_4_Classes.Java_Assignment_4_Classes.src.three;

// Write a class named TalkablePerson that declares a public talk() method along with name (String) and age
// (int) properties. The talk() method should have a void return type and print the message, “Hello my name is:
// {name}”. Instead of {name} the person’s name property should be printed. In a Main class, create an
// instance of Person and use their talk method. Place these files in a package named, “three”.

public class Application {
    public static void main(String[] args) {
        TalkablePerson p = new TalkablePerson();
        p.setName("Henry");
        p.setAge(9);
        p.talk();
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
    }
    
}