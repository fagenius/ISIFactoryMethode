package ISI;

/**
* Log dans la console (Product)
*/
public class ConsoleLogger implements ILogger {
	public synchronized void log(String src, String msg) {
		System.out.println(src + " (" + System.nanoTime() + ")" + " : " + msg);
	}
}