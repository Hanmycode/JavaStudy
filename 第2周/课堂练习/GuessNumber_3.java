package week2;

import java.util.Scanner;

public class GuessNumber_3 {
	public static void main(String args[]) {
		int myGuess = 0;
		int randomNumber;
		randomNumber = (int) (1 + Math.random() * 1000);

		System.out.println(randomNumber);
		System.out.println("I have a number between 1 and 1000.");
		System.out.println("Can you guess my number?");
		System.out.println("Please type your guess.");
		int times;
		for (times = 1; times <= 10; times++) {
			Scanner scan = new Scanner(System.in);
			myGuess = scan.nextInt();

			if (myGuess == randomNumber) {
				System.out.println("Excellent!You guess the number!");
				break;
			} else if (myGuess > randomNumber) {
				System.out.println("Too high.Try again.");
			} else {
				System.out.println("Too low.Try again.");
			}
			System.out.println("Only left " + (10 - times) + " times!");
		}

		System.out.println("Game over!");

	}

}
