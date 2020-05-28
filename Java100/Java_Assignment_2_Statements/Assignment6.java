package Java_Assignment_2_Statements;

public class Assignment6 {
    // 6.	Write a class named Assignment6 which creates a float variable x. Set x to some value. 
    // Then write an if-statement that checks if x is equal to 3. If so, print the message, “x is equal to 3”. 
    // Write an else-if statement to check if x is greater than 5, and, if so, prints the message, 
    // “x is greater than 5”. Write another else-if statement to check if x is less than or equal to 0. 
    // If so, it prints the message, “x is less than or equal to 0”. Write an else-statement to prints the message,
    //  “x is none of the other options”. 

    public static void main(String[] args) {
        float x = 2.075f;
        if (x == 3){
            System.out.println("x == 3");
        }
        else if (x == 5){
            System.out.println("x == 5");
        }
        else if (x <= 0){
            System.out.println("x <= 0");
        }
        else{
            System.out.println("x is none of the other options");
        }

    }
    
}