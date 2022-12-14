package kodlama.io.rentACar.business.concretes;

import java.util.List;
import org.springframework.stereotype.Service;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service  // bu sınıf bir service nesnesidir.
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;
	
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		// iş kuralları burada olacak
		return brandRepository.getAll();
	}
}