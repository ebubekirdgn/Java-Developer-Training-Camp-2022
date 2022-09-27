public class Main {
    public static void main(String[] args) {
        /* interface özellikleri
        *newlenemez
        * bir class birden fazla interface'yi implement'e edebilir.
        * sadece bir tane class extend edebilir
        * */

        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();
    }
}