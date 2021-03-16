import java.util.Scanner;

public class gpa {
	public static void main(String args[]) {
		
		String grades="";
		String[] gradesletter = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "D-", "F"}; 
		double[] gradesDecimal = {4.0, 3.6, 3.2, 3.0, 2.6, 2.2, 2.0, 1.6, 1.2, 1.0, 0.0};
		double C1;
		double C2;
		double C3;
		double C4;
		double C5;
		double C6;
		double gradeAmount = 0;
		double totalAmountCourse1 =0;
		double totalAmountCourse2 =0;
		double totalAmountCourse3 =0;
		double totalAmountCourse4 =0;
		double totalAmountCourse5 =0;
		double totalAmountCourse6 =0;
		double FinalAmount =0;
		double FinalCredit =0;
		double gpa;
		
		System.out.println("Hello students of Quinnipiac University, would you like to calculate your GPA?");
		String message;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name");
		message = scan.nextLine();
		System.out.println("Please enter your last name");
		message = scan.nextLine();
		System.out.println("Please enter your major ");
		message = scan.nextLine();
		System.out.println("Please enter your QU ID number, located on your QU Card ");
		message = scan.nextLine();
		System.out.println("Please enter the CourseID for a class you are currently taking ");
		message = scan.nextLine();
	}
}