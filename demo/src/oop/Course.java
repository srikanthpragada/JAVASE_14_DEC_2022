package oop;

public class Course {
	private String name;
	private int duration, fee;
	private String remarks;

	public Course(String name, int duration, int fee, String remarks) {
		this(name,duration,fee);
		this.remarks = remarks;
	}

	public Course(String name, int duration, int fee) {
		this.name = name;
		this.duration = duration;
		this.fee = fee;
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
