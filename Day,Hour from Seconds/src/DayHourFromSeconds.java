import java.util.Scanner;

//DayHourCounter
public class DayHourFromSeconds {
	//begin of class
	public static void main (String [] args) {
		//start of main method
			Scanner input = new Scanner(System.in); //imports a scanner.
			
			System.out.println("Enter total amount of Seconds : ");
			int second = input.nextInt();
			input.close() ; //closes scanner.
			
			int day, hour, min ; //Declaration
			
			min = second / 60 ;			//calculating minutes.
			second = second % 60 ;		//the remaining is the seconds.
			
			hour = min / 60 ;			//calculating hours.
			min = min % 60 ;			//the remaining is the minutes.
			
			day = hour / 24 ;			//calculating days.
			hour = hour % 24 ;			//the remaining is the hours.
			
			System.out.printf("%d Days, %d Hours, %d Minutes, %d Seconds \n", day, hour, min, second);
			
	}	
}
