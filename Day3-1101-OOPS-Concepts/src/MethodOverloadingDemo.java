
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 39;
		float f = 34.32f;
		double d1 = 45.223;
		double d2 = 23.43434;
		long l1 = 90L;

		System.out.println(arithAdd(d1,l1 ));
	}
	
	
	public static int arithAdd(int a, int b) {
		System.out.println("method 1");
		return a + b;
	}

	public static float arithAdd(int a, float f) {
		System.out.println("method 2");
		return a + f;
	}
	
	public static double arithAdd(int a, double d) {
		System.out.println("method 3");
		return a + d;
	}
	
	public static double arithAdd(double a, double d) {
		System.out.println("method 4");
		return a + d;
	}
	
	public static double arithAdd(float a, float b) {
		System.out.println("method 5");
		return a + b;
	}
	
	public static double arithAdd(double a, float d) {
		System.out.println("method 6");
		return a + d;
	}
}
