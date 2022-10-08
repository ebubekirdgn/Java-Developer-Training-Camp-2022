package KodlamaIo.business;

import java.util.List;

import KodlamaIo.core.logging.Logger;
import KodlamaIo.dataAccess.category.CategoryDao;
import KodlamaIo.entities.Category;

public class CategoryManager {
   private CategoryDao categoryDao;
   private List<Logger> loggers;
   
   public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
   }
   
   public void add(Category category) throws Exception{
	   
	   if (categoryDao.existsByName(category.getCategoryName())) {
		   	throw new Exception("Category Name Already Exist");
	   }
	   categoryDao.add(category);
   }
   public void deleteById(long id){
	   categoryDao.deleteById(id);
   }
}
