import java.io.IOException;
import java.util.Scanner;

public class ReadingTXT {
	public static void main (String [] args) throws IOException {
		//create file instance.
		java.io.File file = new java.io.File("Writing Test.txt");
		
		//creates a Scanner
		Scanner input = new Scanner(file);
			
		//reads Data
		while(input.hasNext()) {
			String firstName = input.next();
			String midName = input.next();
			String lastName = input.next();
			int num = input.nextInt();

			System.out.print("\n" + firstName + " " + midName + " " + lastName + " " + num);
		}
		
		input.close();
		//System.out.print(firstName + " " + midName + " " + lastName + " " + num);
	}
}
