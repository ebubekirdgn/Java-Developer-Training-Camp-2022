public class CustomerManager{
   public void Add(){
		System.out.println("Müşteri eklendi");
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.Log("Database Log Mesajı");
   }	   
}
