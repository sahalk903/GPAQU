import java.util.Scanner;

public class gpa {
	public static void main(String args[]) {

		String grades = "";
		String[] gradesletter = { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "D-", "F" };
		double[] gradesDecimal = { 4.0, 3.6, 3.2, 3.0, 2.6, 2.2, 2.0, 1.6, 1.2, 1.0, 0.0 };
		double C1;
		double C2;
		double C3;
		double C4;
		double C5;
		double C6;
		double gradeAmount = 0;
		double totalAmountCourse1 = 0;
		double totalAmountCourse2 = 0;
		double totalAmountCourse3 = 0;
		double totalAmountCourse4 = 0;
		double totalAmountCourse5 = 0;
		double totalAmountCourse6 = 0;
		double FinalAmount = 0;
		double FinalCredit = 0;
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

		Scanner console = new Scanner(System.in);

		System.out.println("Please enter the amount of credits of the classes CourseID you just entered");
		C1 = console.nextDouble();
		System.out.println("Please enter your letter grade, for instance, A, A-, B, C-, etc. for that course");
		grades = console.next();

		if (grades.equals("A"))
			gradeAmount = 4.0;
		else if (grades.equals("A-"))
			gradeAmount = 3.6;
		else if (grades.equals("B+"))
			gradeAmount = 3.2;
		else if (grades.equals("B"))
			gradeAmount = 3.0;
		else if (grades.equals("B-"))
			gradeAmount = 2.6;
		else if (grades.equals("C+"))
			gradeAmount = 2.2;
		else if (grades.equals("C"))
			gradeAmount = 2.0;
		else if (grades.equals("C-"))
			gradeAmount = 1.6;
		else if (grades.equals("D"))
			gradeAmount = 1.2;
		else if (grades.equals("D-"))
			gradeAmount = 1.0;
		else if (grades.equals("F"))
			gradeAmount = 0.0;
		else
			System.out.println("Sorry, this is invalid. Please enter a valid letter grade. ");

		totalAmountCourse1 = gradeAmount * C1;

		System.out.println("Please enter the amount of credits for the next class that you would like to caculate");
		C2 = console.nextDouble();
		System.out.println("Please enter your letter grade, for instance, A, A-, B, C-, etc. for that course");
		grades = console.next();

		if (grades.equals("A"))
			gradeAmount = 4.0;
		else if (grades.equals("A-"))
			gradeAmount = 3.6;
		else if (grades.equals("B+"))
			gradeAmount = 3.2;
		else if (grades.equals("B"))
			gradeAmount = 3.0;
		else if (grades.equals("B-"))
			gradeAmount = 2.6;
		else if (grades.equals("C+"))
			gradeAmount = 2.2;
		else if (grades.equals("C"))
			gradeAmount = 2.0;
		else if (grades.equals("C-"))
			gradeAmount = 1.6;
		else if (grades.equals("D"))
			gradeAmount = 1.2;
		else if (grades.equals("D-"))
			gradeAmount = 1.0;
		else if (grades.equals("F"))
			gradeAmount = 0.0;
		else
			System.out.println("Sorry, this is invalid. Please enter a valid letter grade.");

		totalAmountCourse2 = gradeAmount * C2;

		System.out.println("Please enter the amount of credits for the next class that you would like to caculate");
		C3 = console.nextDouble();
		System.out.println("Please enter your letter grade, for instance, A, A-, B, C-, etc. for that course");
		grades = console.next();

		if (grades.equals("A"))
			gradeAmount = 4.0;
		else if (grades.equals("A-"))
			gradeAmount = 3.6;
		else if (grades.equals("B+"))
			gradeAmount = 3.2;
		else if (grades.equals("B"))
			gradeAmount = 3.0;
		else if (grades.equals("B-"))
			gradeAmount = 2.6;
		else if (grades.equals("C+"))
			gradeAmount = 2.2;
		else if (grades.equals("C"))
			gradeAmount = 2.0;
		else if (grades.equals("C-"))
			gradeAmount = 1.6;
		else if (grades.equals("D"))
			gradeAmount = 1.2;
		else if (grades.equals("D-"))
			gradeAmount = 1.0;
		else if (grades.equals("F"))
			gradeAmount = 0.0;
		else
			System.out.println("Sorry, this is invalid. Please enter a valid letter grade.");

		totalAmountCourse3 = gradeAmount * C3;

		System.out.println("Please enter the amount of credits for the next class that you would like to caculate");
		C4 = console.nextDouble();
		System.out.println("Please enter your letter grade, for instance, A, A-, B, C-, etc. for that course");
		grades = console.next();

		if (grades.equals("A"))
			gradeAmount = 4.0;
		else if (grades.equals("A-"))
			gradeAmount = 3.6;
		else if (grades.equals("B+"))
			gradeAmount = 3.2;
		else if (grades.equals("B"))
			gradeAmount = 3.0;
		else if (grades.equals("B-"))
			gradeAmount = 2.6;
		else if (grades.equals("C+"))
			gradeAmount = 2.2;
		else if (grades.equals("C"))
			gradeAmount = 2.0;
		else if (grades.equals("C-"))
			gradeAmount = 1.6;
		else if (grades.equals("D"))
			gradeAmount = 1.2;
		else if (grades.equals("D-"))
			gradeAmount = 1.0;
		else if (grades.equals("F"))
			gradeAmount = 0.0;
		else
			System.out.println("Sorry, this is invalid. Please enter a valid letter grade.");

		totalAmountCourse4 = gradeAmount * C4;

		System.out.println("Please enter the amount of credits for the next class that you would like to caculate");
		C5 = console.nextDouble();
		System.out.println("Please enter your letter grade, for instance, A, A-, B, C-, etc. for that course");
		grades = console.next();

		if (grades.equals("A"))
			gradeAmount = 4.0;
		else if (grades.equals("A-"))
			gradeAmount = 3.6;
		else if (grades.equals("B+"))
			gradeAmount = 3.2;
		else if (grades.equals("B"))
			gradeAmount = 3.0;
		else if (grades.equals("B-"))
			gradeAmount = 2.6;
		else if (grades.equals("C+"))
			gradeAmount = 2.2;
		else if (grades.equals("C"))
			gradeAmount = 2.0;
		else if (grades.equals("C-"))
			gradeAmount = 1.6;
		else if (grades.equals("D"))
			gradeAmount = 1.2;
		else if (grades.equals("D-"))
			gradeAmount = 1.0;
		else if (grades.equals("F"))
			gradeAmount = 0.0;
		else
			System.out.println("Sorry, this is invalid. Please enter a valid letter grade.");

		totalAmountCourse5 = gradeAmount * C5;

		System.out.println("Please enter the amount of credits for the next class that you would like to caculate");
		C6 = console.nextDouble();
		System.out.println("Please enter your letter grade, for instance, A, A-, B, C-, etc. for that course");
		grades = console.next();

		if (grades.equals("A"))
			gradeAmount = 4.0;
		else if (grades.equals("A-"))
			gradeAmount = 3.6;
		else if (grades.equals("B+"))
			gradeAmount = 3.2;
		else if (grades.equals("B"))
			gradeAmount = 3.0;
		else if (grades.equals("B-"))
			gradeAmount = 2.6;
		else if (grades.equals("C+"))
			gradeAmount = 2.2;
		else if (grades.equals("C"))
			gradeAmount = 2.0;
		else if (grades.equals("C-"))
			gradeAmount = 1.6;
		else if (grades.equals("D"))
			gradeAmount = 1.2;
		else if (grades.equals("D-"))
			gradeAmount = 1.0;
		else if (grades.equals("F"))
			gradeAmount = 0.0;
		else
			System.out.println("Sorry, this is invalid. Please enter a valid letter grade.");
	}
}