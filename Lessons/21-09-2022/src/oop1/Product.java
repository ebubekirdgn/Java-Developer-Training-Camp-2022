package oop1;

//Class isimleri Pascal Case isimlendirme kuralına göre verilir.

public class Product {
	private String _name;
	private double _unitPrice;
	private double _discount;
	private String _imageUrl;
	private int _unitsInStock;

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public double get_unitPrice() {
		return _unitPrice;
	}

	public void set_unitPrice(double _unitPrice) {
		this._unitPrice = _unitPrice;
	}

	public double get_discount() {
		return _discount;
	}

	public void set_discount(double _discount) {
		this._discount = _discount;
	}

	public String get_imageUrl() {
		return _imageUrl;
	}

	public void set_imageUrl(String _imageUrl) {
		this._imageUrl = _imageUrl;
	}

	public int get_unitsInStock() {
		return _unitsInStock;
	}

	public void set_unitsInStock(int _unitsInStock) {
		this._unitsInStock = _unitsInStock;
	}

}
