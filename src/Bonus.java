import java.util.Random;
import java.util.Scanner;

/*
 * Jasmyn Stansfield
 * Mr. Hardman
 * Assignment 3, bonus
 * November 1, 2016
 */
public class Bonus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int userNum;
		int randomNum;
		
		
		
		do {
			
			Random randGenerator = new Random();
			randomNum = randGenerator.nextInt(9) + 1;
			
			System.out.println("Guess a number between 1 and 10 (If you wish to end the game, press -1)");
			userNum = userInput.nextInt();
		
			if (userNum != randomNum) {
			
				System.out.println("Sorry, the correct number is " + randomNum + ".");
			}
		
			else if (userNum == -1){
				System.out.println("I'm sad to see you go :(");
				userInput.close();
			}
			else {
				System.out.println("Corect, good job!");
				userInput.close();
			}
		
		} while (userNum != randomNum);
	}

}
