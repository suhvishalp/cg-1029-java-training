
public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//regular expressions 
		
		String mobileNumber = "7789292192";

		
		if(mobileNumber.matches("[6789]\\d{9}"))
				System.out.println("Valid Mobile");
		else 
			System.out.println("Invalid");
	}

}
