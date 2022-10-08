//bir urunun kurallara uygun olup olmadigini  bulmak icin yapariz,
/* statik tanımlamalarda ; newlenen nesne bellekten atılırken statikte
uygulama sıfırlanana kadar bellekten hiçbir şekilde atmıyor.*/
//NOT : Ana class static olamaz.
public class ProductValidator{

	static {
		System.out.println("Static yapıcı blok çalıştı.");
	}
	
	public ProductValidator(){
		System.out.println("Yapıcı blok çalıştı.");
	}
	public static boolean isValid(Product product){
		if(product.price > 0 && !product.name.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	public void other(){} // buna ulaşmak için ProductValidator'ı newlememiz lazım

	public class BaskaBirClass{
	pubic static void Sil(){}
	}
}
//inner classa verilebilir static ama genel classa verilemez.