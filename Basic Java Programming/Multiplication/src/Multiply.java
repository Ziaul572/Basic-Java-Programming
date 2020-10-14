//Multiplication of three integers.

import java.util.Scanner;
public class Multiply {
	//Beginning of the class method.
	public static void main (String[ ] args ) {
		//start of main function
		
		Scanner input = new Scanner(System.in);
		
		int number1, number2, number3, multiplication ; //initialization
		
		System.out.println("Enter the first integer : ");
		number1 = input.nextInt() ;						//1st input
		
		System.out.println("Enter the second integer : ");
		number2 = input.nextInt() ;						//2nd input
		
		System.out.println("Enter the third integer : ");
		number3 = input.nextInt() ;						//3rd input
		
		multiplication = number1 * number2 * number3 ; //calculation
		
		System.out.printf("The Multiplication is %d ", multiplication); //output on console.
	}
}
