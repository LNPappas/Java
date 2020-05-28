package Java_Assignment_2_Statements;

public class Assignment11 {

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int count = 1;
        for (int i : arr){
            while (count <=10){
                System.out.println(i*count);
                count++;
            }
            count = 1;
        }
    }
    
}