//Matrix Multiplication

import java.util.Scanner;
 
public class MatrixMultiplication {
		//A method for multiplying 2 matrices with their grid number.
	public static int[][] multiply(int a, int [][]mat1, int [][]mat2 ) {
			int [][] finalMat = new int [a][a] ;	//2D array to store output matrix.
		
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < a; j++) {
					finalMat[i][j] = 0; 			//to remove garbage values.
					
					for(int k = 0; k < a; k++) {
							//Concentrate here plz. The trick begins here.
					finalMat[i][j] = finalMat[i][j] + ( mat1[i][k] * mat2[k][j]) ;  
																
				}
				}

			}
			
			return finalMat;		//returns the array. caution(match both data types)
	}
	
		public static void main (String [] args) {
			int n;
			Scanner input = new Scanner (System.in);
			
			System.out.println("Enter the matrix grid.");
			n = input.nextInt();
			int [][]matrix1 = new int [n][n];
			int [][]matrix2 = new int [n][n];
			int [][]output = new int [n][n];
			
			System.out.println("Enter The 1st matrix values:");
			int i , j;
			for(i = 0; i < n; i ++) {
				for(j = 0; j < n; j++) {
					matrix1[i][j]  = input.nextInt();
				}
			}
			System.out.println("Enter The 2nd matrix values:");
			for(i = 0; i < n; i ++) {
				for(j = 0; j < n; j++) {
					matrix2[i][j]  = input.nextInt();
				}
			}
			
			input.close();
			output = multiply( n, matrix1, matrix2);
			
			for(i = 0; i < n; i++) {
				for(j = 0; j < n; j++) {
					System.out.print(output[i][j] + " ");
				}
				System.out.println();
			}
		}
}
