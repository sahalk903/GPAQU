import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class gpa {
	public static void main(String args[]) {
		System.out.println("Hello student of Quinnipiac University, this is a GPA calculator.");
		try {
			FileWriter fileWriter = new FileWriter("gpa.txt");
			PrintWriter out = new PrintWriter(fileWriter);
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your full name");
			out.println("Name: " + scan.nextLine());
			System.out.println("Please enter your major ");
			out.println("Major: " + scan.nextLine());
			boolean valid = false;
			do {
				try {
					System.out.println("Please enter your QU ID number, located on your QU Card ");
					out.println("QU ID: " + scan.nextInt());
					valid = true;
				}
				catch (InputMismatchException e) {
					System.out.println("Please enter a valid ID number.");
					scan.nextLine();
				}
			} while(!valid);
			
			valid = false;
			int numClasses = 0;
			do {
				try {
					System.out.println("How many classes are you taking?");
					numClasses = scan.nextInt();
					valid = true;
				}
				catch (InputMismatchException e) {
					System.out.println("Please enter a valid number of classes.");
					scan.nextLine();
				}
			} while(!valid);
			scan.nextLine();

			int count = 0;
			int credits = 0;
			double gpa = 0;

			while (count < numClasses) {
				System.out.println("What is the name of class " + (count + 1));
				String name = scan.nextLine();
				System.out.println("How many credits is the class?");
				int cred = scan.nextInt();
				while (cred != 1 && cred != 3) {
					System.out.println("That is not a valid credit amount.");
					System.out.println("How many credits is the class?");
					cred = scan.nextInt();
				}
				scan.nextLine();
				credits = credits + cred;
				double classValue = classValue();
				gpa = gpa + classValue*cred;
				out.println(name + ": " + classValue);
				count++;
			}
			out.println("Total Credits: " + credits);
			out.print("GPA: " + gpa/credits);
			out.close();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Your file has been stored.");
	}

	public static double classValue() {
		Scanner console = new Scanner(System.in);

		System.out.println("Please enter your letter grade, for instance, A, A-, B, C-, etc. for that course");
		String grade = console.nextLine();

		if (grade.equals("A"))
			return 4.0;
		else if (grade.equals("A-"))
			return 3.6;
		else if (grade.equals("B+"))
			return 3.2;
		else if (grade.equals("B"))
			return 3.0;
		else if (grade.equals("B-"))
			return 2.6;
		else if (grade.equals("C+"))
			return 2.2;
		else if (grade.equals("C"))
			return 2.0;
		else if (grade.equals("C-"))
			return 1.6;
		else if (grade.equals("D"))
			return 1.2;
		else if (grade.equals("D-"))
			return 1.0;
		else if (grade.equals("F"))
			return 0.0;
		else {
			System.out.println("Sorry, this is invalid. Please enter a valid letter grade.");
			return classValue();
		}
	}
}