// Create a Java project in eclipse, called "PracticeCar"
// Create a class called "Simulator", with a main() method.
// Create a "Car" class, with a run() method.
// Inside the main() method of Simulator, create an instance of a Car object, and invoke that object's run() method.

public class Car {
    Engine engine;
    FuelTank tank;

    public Car(){
        this.engine = new Engine();
        this.tank = new FuelTank();
    }
    public void run(){
        System.out.println("running...");
    }
}
