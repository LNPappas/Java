package Java_Assignment_2_Statements;

public class Assignment1 {
    
    public boolean even(int num){
        return num%2 == 0;
    }

    public static void main(String[] args) {
        Assignment1 a = new Assignment1();
        System.out.println(a.even(5));
        System.out.println(a.even(4));
    }
}