package ISI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
* Log dans un fichier (Product)
*/
public class FileLogger implements ILogger {
	public synchronized void log(String src, String msg) {
		try {
			PrintWriter sortie = new PrintWriter(new FileOutputStream("Test.log", true));
			sortie.println(src + " (" + System.nanoTime() + ")" + " : " + msg);
			sortie.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}