//     Write a class CustomException that extends the Exception class. In another class Runner, write a
// method, run() that throws this CustomException. Use a try/catch/block to manage exception handling in
// an Application class that instantiates a Runner and calls its run method.

public class Runner {

	public void run() throws CustomException {
		throw new CustomException("Tried running but failed.");
	}
}