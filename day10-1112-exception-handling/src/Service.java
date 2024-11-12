
public class Service {

	public static int calculateAge(int age, int number) throws ArithmeticException {
		return age / number;
	}
	
	public static boolean isValidAge(int age) throws InvalidAgeException  {
		
		if(age >= 100 || age<0) {
			throw new InvalidAgeException(age + " is not valid");
		}
				
		return true;
	}
}
