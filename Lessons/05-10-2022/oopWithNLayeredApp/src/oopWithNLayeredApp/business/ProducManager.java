package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProducManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProducManager(ProductDao productDao,Logger[] loggers) {
		 this.productDao = productDao;
		 this.loggers = loggers;

	}
	
	public void add(Product product) throws Exception {
		// iş kuralları buraya yazılacak
		if(product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz.");
		}
		/*JdbcProductDao productDao = new JdbcProductDao();
		productDao.add(product);*/

		
		/*HibernateProductDao hibernateProductDao = new HibernateProductDao();
		hibernateProductDao.add(product);*/
		
		
		//bir katman baska bir katmanın classını kullanıyorken sadece interfaceinden erisim kurmalıdır.
		//ProductDao productDao = new JdbcProductDao();
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
 }
