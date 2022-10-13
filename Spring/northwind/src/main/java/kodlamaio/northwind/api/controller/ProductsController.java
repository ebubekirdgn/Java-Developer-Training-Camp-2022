package kodlamaio.northwind.api.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
		private ProductService productService;
		
		/*
		 * AutoWired ProductService nerede kim tarafından implement edilmiş diye 
		 * tüm projeyi tarıyor ve bakıyor ki onu ProductManager imp. etmiş
		 * gidiyor onu new'liyor bizim newlememize gerek kalmadan.
		 * */
		
		@Autowired
		public ProductsController(ProductService productService) {
			this.productService = productService;
		}

		@GetMapping("/getAll")
		public List<Product> getAll(){
			return this.productService.getAll();
		}
}