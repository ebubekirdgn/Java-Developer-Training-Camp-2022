package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository // bu sınıf bir DataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"Bmw"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Fiat"));
		brands.add(new Brand(4,"Audi"));
		brands.add(new Brand(5,"Porsche"));
	}
	
	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

}
