package two;

// Create a package, “two” to place files in.
// Create an interface Animatable that extends Movable (from the above assignment) and declares a
// method animate(). Create a class named MoverAndAnimate that implements Animatable. In an
// Application2 class, create an instance of a MoverAndAnimate and execute both the move() and
// animate() methods.

public class MoverAndAnimate implements Animatable{

        public void animate(){
            System.out.println("animating...");
        }
        public void move(){
            System.out.println("On the move!!");
        }
    
}