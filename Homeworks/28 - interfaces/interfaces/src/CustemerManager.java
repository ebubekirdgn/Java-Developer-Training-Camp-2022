public class CustomerManager{
	/* 1. Yöntem
	ICustomerDal customerDal;
	
	public void add(){
		// iş kodları burada yazılır.
		customerDal.Add();
		
	}*/
	/* 2. Yöntem Constructorda karsilama*/
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal){
		this.customerDal=customerDal;
	}
	
	public void add(){
		// iş kodları burada yazılır.
		customerDal.Add();
		
	}
	
}
