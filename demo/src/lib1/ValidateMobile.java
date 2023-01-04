package lib1;

public class ValidateMobile {

	public static void main(String[] args) {
		var st = "3939339332";
		var valid = true; 
		
		if(st.length() == 10)
		{
			for(var i = 0; i < st.length() ; i ++) {
				if(!Character.isDigit(st.charAt(i))) {
					valid = false;
					break; 
				} // if
			} // for
		}
		else
			valid = false; 
		

		if(valid)
			System.out.println("Valid mobile number!");
		else
			System.out.println("Invalid mobile number!");
	}

}
