package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProducManager {
	public void add(Product product) throws Exception {
		// iş kuralları buraya yazılacak
		if(product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz.");
		}
		JdbcProductDao productDao = new JdbcProductDao();
		productDao.add(product);

		
		HibernateProductDao hibernateProductDao = new HibernateProductDao();
		hibernateProductDao.add(product);
	}
	
}
