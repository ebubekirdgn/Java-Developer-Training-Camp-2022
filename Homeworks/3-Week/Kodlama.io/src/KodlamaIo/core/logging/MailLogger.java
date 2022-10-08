package KodlamaIo.core.logging;

public class MailLogger implements Logger {
	@Override
	public void log(String logMessage) {
		System.out.println("Mail gönderildi : " + logMessage);
	}
}