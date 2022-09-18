public class Main {
    public static void main(String[] args) {
	
	//classler referans tiplidir.
     CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2; //bu durumda customerManager'ın heap alanı GB temizler
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}