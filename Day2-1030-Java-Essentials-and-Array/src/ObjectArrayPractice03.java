import java.util.Scanner;

public class ObjectArrayPractice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] students = new Student[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<students.length; i++)
			students[i] = new Student();
		
		for(int i=0; i<students.length; i++) {
			System.out.println("\nEnter values for Student #No: " + i+1);
			
			//Get userinput for rollno, name and marks
			System.out.println("Enter RollNo: ");
			students[i].setRollNo(scanner.nextInt());
			
			System.out.println("Enter Name: ");
			students[i].setName(scanner.next());
			
			double[] marks = students[i].getMarks();
			
			System.out.println("Enter Marks for 3 Subjects : ");
			for(int j=0; j<students[i].getMarks().length; j++) {
				marks[j] = scanner.nextDouble();
			}
			
			students[i].setMarks(marks);
		}
		
		System.out.println("\n--------");
		
		for(int i=0; i<students.length; i++) {
			System.out.print("\n Roll No :  " + students[i].getRollNo());
			System.out.print("\t Name :  " + students[i].getName());
			System.out.println("\t Marks : ");
			
			for(double mark : students[i].getMarks()) {
				System.out.print(mark + " ");
			}

		}

	}

}
