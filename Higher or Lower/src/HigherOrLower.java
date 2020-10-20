//Number Guessing Game.

import java.util.Scanner;
public class HigherOrLower {
	//start of class
	public static void main (String[] args) {
		//start of main method
		
		Scanner input = new Scanner(System.in);
		
		int answer = 100, max = 100;
		char in;
		System.out.println("Guess an integer number between 0 to 100");
		System.out.println("If the guessed number is lower then write higher\nIf the guessed number is higher then write lower\nIf the guessed number is correct then write Yes");
		
		for(int i = 0; i < 100; i++) {
			
			answer = (int)Math.random() % max;
			int guess = answer;
			
			System.out.println("Is this your number : " + answer);
			System.out.print("Higher\nYes \nLower");
			in = input.next().charAt(0);
			
			if (in == 'h' || in == 'H') {
				answer = (int)Math.random() % max ;
				if ()
			}
		}
	}
}
