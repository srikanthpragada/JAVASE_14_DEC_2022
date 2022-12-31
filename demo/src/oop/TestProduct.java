package oop;

class Product {
	protected String name;
	protected int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
	}
 
	public int getDiscount() {
		return 0;
	}
	
	public int getPrice() {
		return this.price;
	}
}

class DiscountedProduct extends Product {
	protected int disRate;

	public DiscountedProduct(String name, int price, int disRate) {
		super(name, price);
		this.disRate = disRate;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.disRate);
	}

	@Override
	public int getPrice() {
		return this.price - (this.price * this.disRate / 100);
	}
    
	@Override 
	public int getDiscount() {
		return this.price * this.disRate / 100;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		Product p;
		
		p = new Product("Product1", 10000);
		System.out.println(p.getPrice()); // Runtime polymorphism 
		
		p = new DiscountedProduct("Product2", 20000, 10); // upcasting
		System.out.println(p.getPrice()); // Runtime polymorphism 
		
		System.out.println(p.getDiscount()); // Runtime polymorphism 

	}

}
