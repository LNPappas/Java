// Write a class CustomException that extends the Exception class. In another class Runner, write a
// method, run() that throws this CustomException. Use a try/catch/block to manage exception handling in
// an Application class that instantiates a Runner and calls its run method.

public class CustomException extends Exception{
    
    private String message;
    private static final long serialVersionUID = 1L;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }
    


}