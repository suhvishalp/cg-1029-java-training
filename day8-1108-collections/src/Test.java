import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Display demo = new Demo();
//		demo.displayResults("Welcome");
		
		Display demo = new Display (){

			@Override
			public void displayResults(String string) {
				// TODO Auto-generated method stub
				System.out.println("String : "+ string);
			}
			
		};
		
		demo.displayResults("Welcome");
		
		
		Comparator<Emp> empComparator = new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				// TODO Auto-generated method stub
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
			
		};
		
		Comparator<Emp> empComparator1 = (o1, o2) ->  o1.getEmpName().compareTo(o2.getEmpName());
		
		
	}

}
