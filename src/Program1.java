/*
 * j.stansfield
 * Mr. Hardman
 * Assignment 3, Program 1
 * October 26, 2015
 */

import java.util.Scanner;

public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
        
        double mark1;
        double mark2;
        double mark3;
        double mark4;
        double mark5;
        
        System.out.println("Please enter 5 grades:\nGrade 1: ");
        mark1 = userInput.nextDouble();
        
        System.out.println("Grade 2: ");
        mark2 = userInput.nextDouble();
        
        System.out.println("Grade 3: ");
        mark3 = userInput.nextDouble();
        
        System.out.println("Grade 4: ");
        mark4= userInput.nextDouble();
        
        System.out.println("Grade 5: ");
        mark5= userInput.nextDouble();
        
        double sum = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = sum / 5;


        System.out.println( String.format("Grade 1 : %6s", mark1));
        System.out.println( String.format("Grade 2 : %6s", mark2));
        System.out.println( String.format("Grade 3 : %6s", mark3));
        System.out.println( String.format("Grade 4 : %6s", mark4));
        System.out.println( String.format("Grade 5 : %6s", mark5));
        System.out.println( String.format("Average : %6s", average));
        
        userInput.close();
	}

}
