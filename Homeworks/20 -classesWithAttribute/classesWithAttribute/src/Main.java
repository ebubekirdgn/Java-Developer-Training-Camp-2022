public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
        product.set_name("Laptop");
        product.set_id(1);
        product.set_description("Asus Laptop");
        product.set_price(250);
        product.set_stockAmount(5);
        System.out.println(product.get_name());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}