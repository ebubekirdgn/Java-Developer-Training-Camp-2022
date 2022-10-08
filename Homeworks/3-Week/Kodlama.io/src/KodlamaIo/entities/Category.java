package KodlamaIo.entities;

public class Category {
	
	private long  id;
	private String categoryName;
	
	public Category(String categoryName,long id) {
		this.id = id;
		this.categoryName = categoryName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	  
	  
}