package week2;

import java.util.Scanner;

public class GuessNumber_4 {

	public static void main(String[] args) {
		String choose;
		do {
			int myGuess = 0;
			int randomNumber;
			boolean success = false;
			randomNumber = (int) (1 + Math.random() * 1000);
			int times;

			System.out.println(randomNumber);
			System.out.println("I have a number between 1 and 1000.");
			System.out.println("Can you guess my number?");
			System.out.println("Please type your guess.");

			for (times = 1; times <= 10; times++) {
				Scanner scan = new Scanner(System.in);
				myGuess = scan.nextInt();

				if (myGuess == randomNumber) {
					System.out.println("Excellent! You guess the number!");
					success = true;
					break;
				} else if (myGuess > randomNumber) {
					System.out.println("Too high. Try again.");
				} else {
					System.out.println("Too low. Try again.");
				}
				System.out.println("Only left " + (10 - times) + " times!");
			}

			if (success) {
				System.out.println("Success! You cost " + times + " times.");
			} else {
				System.out.println("Sorry! You failed!");
			}

			System.out.println("Would you like to play again(y/n)?");
			Scanner scan1 = new Scanner(System.in);
			choose = scan1.next();
		} while (choose.equals("y"));

		System.out.println("Game over!");

	}

}

