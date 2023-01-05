package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		 Object obj;
		 
		 obj = new String("Hello");
		 obj =  20;  // 20 to Integer   -> AutoBoxing 
		 System.out.println(obj.getClass());
		 
		 obj = 10.50;  // 10.50 to Double 

	}

}
