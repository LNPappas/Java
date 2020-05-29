package two;

// Create a package, “two” to place files in.
// Create an interface Animatable that extends Movable (from the above assignment) and declares a
// method animate(). Create a class named MoverAndAnimate that implements Animatable. In an
// Application2 class, create an instance of a MoverAndAnimate and execute both the move() and
// animate() methods.

public class Application2 {

    public static void main(String[] args) {
        
        MoverAndAnimate mA = new MoverAndAnimate();
        mA.animate();
        mA.move();
    }
    
}