//Number Compare
//use of If statements

import java.util.Scanner;
public class NumberCompare {
	//main method begins
	public static void main ( String[ ] args) {
		//create scanner for input.
		Scanner input = new Scanner(System.in);
		int number1, number2;   //input variable declaration
		
		System.out.println("Enter First Integer : ");
		number1 = input.nextInt(); //reads the first integer.
		
		System.out.println("Enter Second Integer : ");
		number2 = input.nextInt(); //reads second integer.
		
		if(number1 == number2) 
			System.out.printf("%d = %d \n", number1, number2);
		if(number1 != number2)
			System.out.printf("%d != %d \n", number1, number2);
		if(number1 > number2) 
			System.out.printf("%d > %d \n", number1, number2);
		if(number1 < number2)
			System.out.printf("%d < %d \n", number1, number2);
		if(number1 >= number2) 
			System.out.printf("%d >= %d \n", number1, number2);
		if(number1 <= number2)
			System.out.printf("%d <= %d \n", number1, number2);
	}	//End of main method
}	//end of class NumberCompare.
