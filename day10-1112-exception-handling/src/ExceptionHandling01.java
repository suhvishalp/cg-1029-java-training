import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling01 {

	
	
	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int age = 23203;
		
		Service.isValidAge(age);
		
		
//		try {
//			
//			System.out.println("Enter Age : ");
//			int age = scanner.nextInt();  //InputMismatchException
//			
//			
//			System.out.println("Enter a number : ");
//			int number = scanner.nextInt();
//			
//			try {
//				boolean flag = Service.isValidAge(age);  //InvalidAgeException
//			}catch(InvalidAgeException ex) {
//				System.out.println(ex.getMessage());
//			}
//			
//			int result = Service.calculateAge(age, number); //ArithmeticException
//		
//			System.out.println("Your Age : " + age);
//		
//			
//		}
//		catch(InputMismatchException ex) {
//			System.out.println("input is incorrect, please input only numbers");
//			System.out.println("message " + ex.getMessage());
//			ex.printStackTrace();
//			
//		}catch(ArithmeticException ex) {
//			System.out.println("Age cannot be divied by 0, enter valid value");
//			System.out.println("message " + ex.getMessage());
//			ex.printStackTrace();
//		}
//		
		
		System.out.println("End of program");

	}

}
