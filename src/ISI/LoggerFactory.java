package ISI;

/**
* Logger factory (Creator)
*/
public class LoggerFactory extends AbstractLoggerFactory {
	/**
	* Factory Method
	* - Le produit à créer est choisi en fonction du paramètre (mode)
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