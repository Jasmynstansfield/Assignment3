/* 
 * Jasmyn Stansfield
 * Mr. Hardman
 * Assignment 3, Program 2
 * October 31, 2016
 */

import java.util.Scanner;


public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		String firstName;
		String lastName;
		String log;
		int grade;
		int studentId;
		float average;
		
		System.out.println("What is your first name? ");
		firstName  = userInput.nextLine();
		
		System.out.println("What is your last name? ");
		lastName = userInput.nextLine();
		
		System.out.println("What grade are you currently in? ");
		grade = userInput.nextInt();
		
		System.out.println("Enter your student ID: ");
		studentId = userInput.nextInt();
		
		System.out.println("Enter your school login: ");
		log = userInput.next();
		
		System.out.println("What is your school average? ");
		average = userInput.nextFloat();
		
		System.out.println( String.format("%-10s: " + log, "Login"));
		System.out.println( String.format("%-10s: " + studentId, "ID"));
		System.out.println( String.format("%-10s: " + lastName + ", " + firstName, "Name"));
		System.out.println( String.format("%-10s: " + average, "Average"));
		System.out.println( String.format("%-10s: " + grade, "Grade"));
		
		userInput.close();
		
	}

}
