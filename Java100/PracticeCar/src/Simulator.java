// Create a Java project in eclipse, called "PracticeCar"
// Create a class called "Simulator", with a main() method.
// Create a "Car" class, with a run() method.
// Inside the main() method of Simulator, create an instance of a Car object, and invoke that object's run() method.

public class Simulator{

    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.engine.condition = 50;
        car.engine.function();
        car.engine.status();
        car.tank.function();
        car.tank.status();


    }
}