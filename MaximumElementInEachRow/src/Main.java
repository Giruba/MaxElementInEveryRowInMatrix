import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		System.out.println("Print the maximum element in every row of the matrix");
		System.out.println("----------------------------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of rows in the matrix");
			int numberOfRows = scanner.nextInt();
			System.out.println("Enter the number of columns in the matrix");
			int numberOfColumns = scanner.nextInt();
			int[][] matrix = new int[numberOfRows][numberOfColumns];
			for(int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
				for(int colIndex = 0; colIndex < numberOfColumns; colIndex++) {
					System.out.println("Enter the element");
					matrix[rowIndex][colIndex] = scanner.nextInt();
				}
			}
			System.out.println("-----Printing the original matrix -----");
			PrintMatrix(matrix);
			System.out.println("-----Printing the maximum in every row of the matrix -----");
			PrintMaximumInEveryRowOfMatrix(matrix);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}		
	}
	
	public static void PrintMatrix(int[][] matrix) {
		for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for(int colIndex = 0; colIndex < matrix[0].length; colIndex++) {
				System.out.print(matrix[rowIndex][colIndex]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void PrintMaximumInEveryRowOfMatrix(int[][] matrix) {
		for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			int maximumInRow = GetMaximumElement(matrix[rowIndex]);
			System.out.println("Maximum in row "+rowIndex+" is "+maximumInRow);
		}
	}
	
	public static int GetMaximumElement(int[] inputArray) {
		int maxElement = Integer.MIN_VALUE;
		
		for(int index = 0; index < inputArray.length; index++) {
			if(inputArray[index] > maxElement) {
				maxElement = inputArray[index]; 
			}
		}
		return maxElement;
	}
}
