public class Main {

	public static void main(String[] args) {
		//EmailLogger emailLogger = new EmailLogger();
		//emailLogger.Log("Log Mesaji")
		
		BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		// bu �ekilde birden fazla verebiliyoruz.
		for(BaseLogger logger:loggers){
			logger.Log("Log Mesaji");
		}
	}
}
