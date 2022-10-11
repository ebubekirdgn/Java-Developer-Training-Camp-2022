package kodlamaio.northwind.entities.concretes;

import lombok.Data;


// Lombok'ın görevi butun getter ve setterları getirmektir.

@Data
public class Product {
	private int id;
	private int categoryId;
	private String productName;
	private double unitPrice;
	private short unitsInStock;
	private String quantityPerUnit;
}
