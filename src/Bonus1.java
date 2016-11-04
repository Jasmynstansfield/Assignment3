/*
 * j.stansfield
 * Mr. Hardman
 * Assignment 3, Program 1
 * November 4, 2015
 */

import java.util.Scanner;

public class Bonus1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);

		int age;
		String name;
		
		System.out.println("What's your name");
		name = userInput.nextLine();
		
		System.out.println("Okay " + name +", how old are you?");
		age = userInput.nextInt();
		
		if (age < 16){
			
			System.out.println("You cannot drive.");
			
		} else if (age < 18) {
			
			System.out.println("You can drive, but cannot vote.");
			
		} else if (age < 24) {
			
			System.out.println("You can vote, but not rent a car.");
			
		} else {
			
			System.out.println("You can pretty much do anything (leagal).");
			
		}
		
		userInput.close();
		
	}

}
