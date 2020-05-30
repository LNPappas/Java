// Every class representing a car part should inherit from a superclass called "CarPart." 
// The CarPart class will have at least the following states and behaviors:
// condition - an integer that represents the remaining durability of the part 
// (starts at 100, goes down to 0 when the part is broken)
// status() - a method that prints the condition of the part to the console.
// The CarPart class should also implement a Functional interface, which declares a method "function()".
// Each subclass of CarPart should have at least one state unique to that part 
// (like the number of cylinders in an engine, or the fuel level of a fuel tank). 
// Each subclass should also implement the inherited function() method to print a unique 
// message to the console that incorporates the variables unique to that class. If you create any custom methods, 
// you should NOT invoke those methods directly from the Car or Simulator class. Those methods (if you write them) should be called 
// from the overriden function() or status() methods.
// Make sure that your Car class creates an instance of each CarPart subclass, as part of its constructor. 
// These instances should be added to a collection of CarPart reference variables.
// The run() method of your Car class should iterate through the Car's collection of CarPart references,
// which stores the instances of the CarPart subclasses. On each iteration, the function() method of the current object in the collection 
// should be invoked.


public class CarPart implements Function{
    protected int condition;

    public CarPart(){
        this.condition = 100;
    }

    public void status(){
        System.out.println("Condition: " + this.condition);
    }
    public void function(){
        System.out.println("CarParts General");
    }
    
}