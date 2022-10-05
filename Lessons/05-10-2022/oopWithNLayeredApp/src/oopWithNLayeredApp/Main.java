package oopWithNLayeredApp;

import java.util.List;
import java.util.logging.Logger;

import oopWithNLayeredApp.business.ProducManager;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = new Product(1,"IPhone Xr",10);
		
		 Logger[] loggers =  {};
		
		// ProducManager producManager = new ProducManager(new HibernateProductDao(), loggers);
		 //producManager.add(product1);
	}

}