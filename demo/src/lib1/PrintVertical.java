package lib1;

public class PrintVertical {

	public static void main(String[] args) {
		 String st = "  Java 19  ";
		 
		 var s  = st.strip();
		 
		 for(int i = 0; i < s.length(); i ++)
			  System.out.println(s.charAt(i));
		 
		 // Character.isDigit();
	}
}
