public class Main {

	public static void main(String[] args) {
		//EmailLogger emailLogger = new EmailLogger();
		//emailLogger.Log("Log Mesajý")	
		
		BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		// bu þekilde birden fazla verebiliyoruz.
		for(BaseLogger logger:loggers){
			logger.Log("Log Mesajý");
		}
	
	}

}
