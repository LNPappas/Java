package examples;

// static: the method exists before the class is instantiated
//     The method belongs to the class, not the object.

// void: return type. Nothing is returned. 

// main method: never returns anything
//      Once executed program is done.


public class MyFirstProgram {

    public static void message(String myString, int myInt) {
        System.out.println("This is my String: " + myString);
        System.out.println("and this is my int: " + myInt);
    }

    public static void main(String[] args){
        message("Hello World!", 4);
    }
}