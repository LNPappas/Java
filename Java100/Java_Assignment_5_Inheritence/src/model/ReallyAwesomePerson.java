package model;

// Create a class named ReallyAwesomePerson that extends AwesomePerson. Overload the inherited talk()
// method to print a statement of your choice. Update the constructors of Person, AwesomePerson and
// ReallyAwesomePerson to print a message of your choice.
// Update the Application class from the above assignment to instantiate a ReallyAwesomePerson and run its
// talk() method that you overloaded.
// Notice the order of the constructors executed when you run the application.
// ReallyAwesomePerson.java should be in the package, model. 

public class ReallyAwesomePerson extends AwesomePerson{

    public ReallyAwesomePerson(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }

    public void talk(){
        System.out.printf("\nYo! Name's %s. %d.\n", this.name, this.age);
    }
    
}