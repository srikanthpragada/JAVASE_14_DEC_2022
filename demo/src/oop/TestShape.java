package oop;

abstract class Shape {
	abstract public double area();
}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public double area() {
		return  Math.PI * this.radius * this.radius; 
	}
}

class Square extends Shape {
	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}
	
	public double area() {
		return  this.side * this.side; 
	}
}


public class TestShape {

	public static void main(String[] args) {
		Shape s = new Circle(10);
		System.out.println(s.area());
		
//		s = new Square(10);
//		System.out.println(s.area());
		
		if(s instanceof Square) {
		   Square sq = (Square) s;  // downcasting
		}
		
		

	}

}
