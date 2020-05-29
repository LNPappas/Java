package Java_Assignment_4_Classes.Java_Assignment_4_Classes.src.three;

// Write a class named TalkablePerson that declares a public talk() method along with name (String) and age
// (int) properties. The talk() method should have a void return type and print the message, “Hello my name is:
// {name}”. Instead of {name} the person’s name property should be printed. In a Main class, create an
// instance of Person and use their talk method. Place these files in a package named, “three”.

public class TalkablePerson {

    private String name;
    private int age;

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
    public void talk(){
        System.out.printf("Hello my name is %s. \n", this.name);
    }
    
}