package oop;

enum Timings {
	MORNING, AFTERNOON, EVENING
}

public class EnumDemo {

	public static void main(String[] args) {
		Timings time;
		int disRate = 0;

		time = Timings.EVENING;

		switch (time) {
		case MORNING:
			disRate = 10;
			break;
		case AFTERNOON:
			disRate = 20;
			break;
		case EVENING:
			disRate = 5;
			break;
		}
 
		System.out.println(disRate);
	}

}
