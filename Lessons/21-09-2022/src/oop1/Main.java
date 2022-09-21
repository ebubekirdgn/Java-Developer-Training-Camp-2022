package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		// set işlemi
		product1.set_name("Delonghi Kahve Makinesi 2");
		product1.set_unitPrice(4500);
		product1.set_discount(6);
		product1.set_unitsInStock(200);
		product1.set_imageUrl("bilmemNe2.jpg");
		// get işlemi
		// System.out.println(product1.name);

		Product product2 = new Product();
		// set işlemi
		product2.set_name("Delonghi Kahve Makinesi 2");
		product2.set_unitPrice(4500);
		product2.set_discount(6);
		product2.set_unitsInStock(200);
		product2.set_imageUrl("bilmemNe2.jpg");
		// get işlemi
		// System.out.println(product2.name);

		Product[] products = { product1, product2 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.get_name() + "</li>");
		}
		System.out.println("</ul>");
	}

}
