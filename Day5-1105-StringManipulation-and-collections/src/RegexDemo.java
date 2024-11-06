
public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//regular expressions 
		
//		String mobileNumber = "7789292192";
//
//		
//		if(mobileNumber.matches("[6789]\\d{9}"))
//				System.out.println("Valid Mobile");
//		else 
//			System.out.println("Invalid");
		
		String str = "he$%23947832894";
		
		if(str.matches("^(?!.*[^a-zA-Z0-9-_]{2}).*$"))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
