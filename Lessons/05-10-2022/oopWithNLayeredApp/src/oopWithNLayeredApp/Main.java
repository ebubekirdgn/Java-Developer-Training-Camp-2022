package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProducManager;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = new Product(1,"IPhone Xr",10);
		ProducManager producManager = new ProducManager(new HibernateProductDao());
		producManager.add(product1);
	}

}