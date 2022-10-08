package KodlamaIo.dataAccess.category;

import KodlamaIo.entities.Category;

public interface CategoryDao {
    void add(Category category);
    void deleteById(long id);
    void getCategories();
    boolean existsByName(String name);  
}
