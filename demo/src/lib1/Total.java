package lib1;

public class Total {
	public static void main(String[] args) {
		 var st = "90,34,44,56,89";
		 
		 var parts = st.split(",");
		 var total = 0;
		 
		 for(var p : parts)
			 total += Integer.parseInt(p);
			 
		 System.out.println(total);
	}
}
