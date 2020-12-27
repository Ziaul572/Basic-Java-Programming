import java.io.* ;
public class WritingInTXT {

		public static void main (String [] args) throws IOException {
			
			java.io.File file = new java.io.File("Writing Test.txt");
			if (file.exists()) {
				System.out.println("File already Exits.");
				System.exit(1);
			}
			
			//file create
			try (
			java.io.PrintWriter output = new java.io.PrintWriter(file);
			){
				//command to print.
			
			output.print("Yo, there mamasita.\n");
			output.print("Willow572\n");
			output.print(23);
			//output.close();
			}
		}
		
}
