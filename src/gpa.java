import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gpa {
	public static void main(String args[]) {
		try {
			FileWriter fileWriter = new FileWriter("gpa.txt");
			PrintWriter out = new PrintWriter(fileWriter);
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your full name");
			out.println("Name: " + scan.nextLine());
			System.out.println("Please enter your major ");
			out.println("Major: " + scan.nextLine());
			System.out.println("Please enter your QU ID number, located on your QU Card ");
			out.println("QU ID: " + scan.nextInt());
			scan.nextLine();
			System.out.println("How many classes are you taking?");
			int numClasses = scan.nextInt();
			out.close();
			fileWriter.close();
			} catch (IOException e) {
			e.printStackTrace();
		}	
		System.out.println("Your file has been stored.");
	}	
		
	public static double classValue()
	{
		Scanner console = new Scanner(System.in);
	
		System.out.println("Please enter your letter grade, for instance, A, A-, B, C-, etc. for that course");
		String grade = console.nextLine();
		
		if (grade.equals("A")) return 4.0;
		else if(grade.equals("A-")) return 3.6;
		else if(grade.equals("B+")) return 3.2;
		else if(grade.equals("B")) return 3.0;
		else if(grade.equals("B-")) return 2.6;
		else if(grade.equals("C+")) return 2.2;
		else if(grade.equals("C")) return 2.0;
		else if(grade.equals("C-")) return 1.6;
		else if(grade.equals("D")) return 1.2;
		else if(grade.equals("D-")) return 1.0;
		else if(grade.equals("F")) return 0.0;
		else
		{
			System.out.println("Sorry, this is invalid. Please enter a valid letter grade.");
			return classValue();
		}
	}
}