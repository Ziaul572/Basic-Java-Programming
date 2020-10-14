//BMI Calculator Java Edition

import java.util.Scanner; 	//Scanner imported.
	//Start of class BMI calc.
public class BMICalculator {
		//Start of main method.
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in); //scanner for input
		

		float height, bodyMass;
		System.out.println("Enter height in Meters : ");
		height = input.nextFloat();	//inputs Height.
		
		System.out.println("Enter Weight in kilograms : ");
		bodyMass = input.nextFloat();	//inputs weight.
		input.close() ; //closes scanner.
		
		float BMI = bodyMass / (height * height);
		
		// BMI index checking.
		if (BMI < 18.5)
			System.out.println("Underweight: less then 18.5");
		if (BMI >= 18.5 && BMI < 24.9)
			System.out.println("Normal : Between 18.5 and 24.9");
		if (BMI >= 24.9 && BMI < 29.9)
			System.out.println("Overweight : Between 25 and 29.9");
		if (BMI > 29.9)
			System.out.println("Obese : Over 30");
		System.out.printf("BMI = %f \n", BMI);
	}	//end of main method
}		//end of class BMIcalc
