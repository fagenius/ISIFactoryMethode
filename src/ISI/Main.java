package ISI;

public class Main {
	public static void main(String[] args) {
		LoggerFactory factory = new LoggerFactory();
		ILogger logger = factory.createLogger(LoggerFactory.FICHIER);
		logger.log(Main.class.toString(), "Bonjour ");
		logger.log(Main.class.toString(), "le ");
		logger.log(Main.class.toString(), "monde 120000");
	}
}