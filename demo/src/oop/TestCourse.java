package oop;

public class TestCourse {

	public static void main(String[] args) {
		var c = new Course("java", 36, 5000, "Prereq. is c");
		c.print();
		System.out.println(c.getNetFee());
	}

}
