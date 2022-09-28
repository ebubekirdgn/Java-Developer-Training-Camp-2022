public class Main {
    public static void main(String[] args) {
        /* interface özellikleri
        *newlenemez
        * bir class birden fazla interface'yi implement'e edebilir.
        * sadece bir tane class extend edebilir
        * */

        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.Add();
		
		//Bağımlılığı azalttık 1. Yöntem
		CustomerManager customerManager  = new CustomerManager();
		customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();
		
		//Bağımlılığı azalttık 2. Yöntem contructor ile karsiladik veritabanını
		CustomerManager customerManager  = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
    }
}