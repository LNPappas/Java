// Write a class CustomException that extends the Exception class. In another class Runner, write a
// method, run() that throws this CustomException. Use a try/catch/block to manage exception handling in
// an Application class that instantiates a Runner and calls its run method.

public class Application {
    public static void main(String[] args) {
        Runner r = new Runner();
        try {
            r.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}