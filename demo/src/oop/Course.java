package oop;

public class Course {
	private String name;
	private int duration, fee;
	private String remarks;

	public Course(String n, int d, int f, String r) {
		name = n;
		duration = d;
		fee = f;
		remarks = r;
	}

	public void print() {
		System.out.println(name);
		System.out.println(duration);
		System.out.println(fee);
		System.out.println(remarks);
	}
	
	public int getNetFee() {
		return fee + fee * 18 / 100; 
	}
}
