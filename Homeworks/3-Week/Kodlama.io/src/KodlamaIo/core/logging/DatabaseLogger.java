package KodlamaIo.core.logging;

public class DatabaseLogger implements Logger {
	@Override
	public void log(String logMessage) {
		System.out.println("Database loglandı : " + logMessage);
	}
}