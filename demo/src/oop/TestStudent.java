package oop;

class Student {
	private String name;
	private int course, feepaid;
	public Student(String name, int course, int feepaid) {
		this(name,course);
		this.feepaid = feepaid;
	}
	
	public Student(String name, int course) {
		this(name);
		this.course = course;
	}

	public Student(String name) {
		this.name = name;
		this.course = 1;
	}
	
	public void payment(int amount) {
		this.feepaid += amount;
	}
	
	private int getTotalFee() {
		return  this.course == 1 ? 10000 : 20000;
	}
	
	public String getCourseName() {
		return  this.course == 1 ? "Java" : "Spring";
	}
	
	public int getDue() {
		return  this.getTotalFee() - this.feepaid;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.getCourseName());
		System.out.println(this.feepaid);
		System.out.println(this.getDue());
	}
	
}

public class TestStudent {

	public static void main(String[] args) {
		 Student s = new Student("Scott");
		 s.print();
		 System.out.println(s.getCourseName());

	}

}
