package ISI;

/**
* Factory abstraite (Abstract Creator)
*/
public abstract class AbstractLoggerFactory {
	public static final int CONSOLE = 1;
	public static final int FICHIER = 2;
	public abstract ILogger createLogger(int mode);
}