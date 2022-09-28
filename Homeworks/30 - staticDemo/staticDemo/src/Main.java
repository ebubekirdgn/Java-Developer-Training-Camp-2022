public class Main {
    public static void main(String[] args) {
      ProductManager productManager =  new ProductManager();
	  Product product = new Product();
	  product.price = 120;
	  product.name="Klavye";
	  productManager.add(product);
	  
	  
	  DatabaseHelper.Crud.Delete();
	  DatabaseHelper.Connection.CreateConnection(); // gibi şeylerde yapabiliriz.
    }
}