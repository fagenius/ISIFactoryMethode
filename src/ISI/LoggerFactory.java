package ISI;

/**
* Logger factory (Creator)
*/
public class LoggerFactory extends AbstractLoggerFactory {
	/**
	* Factory Method
	* - Le produit � cr�er est choisi en fonction du param�tre (mode)
	*/
	public ILogger createLogger(int mode) {
		ILogger logger;
		switch (mode) {
			case CONSOLE : logger = new ConsoleLogger(); break;
			case FICHIER : logger = new FileLogger(); break;
			default : logger = new ConsoleLogger(); break;
		}
		return logger;
	}
}