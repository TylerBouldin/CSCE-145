/*
 * Tyler Bouldin
 */

import java.util.Scanner;


public class Additionprogram {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.println("Welcome to the matrix adder program!");
		System.out.println("Enter the length, than width of the first matrix");

		//first I created two variables to capture the matrix's length and width
		int length = k.nextInt();
		int width = k.nextInt();

		//I then used those variables as the size of the matrix because the size needs to be specified but we need the user to input those values
		int [][]volume= new int [length][width];

		for(int i = 0; i<volume.length;i++) 
		{
			for(int j = 0; j<volume[i].length;j++) 
			{
				//this allows for the user to input values for each location of the array, for the first array by 
				// using k.nextInt the assign each location a value that the user specifies.
				System.out.println("Enter value for " + i + " " + j);
				volume[i][j] = k.nextInt();
			}
		}

		System.out.println("Now enter the same length and width for the second matrix");

		int lengthtwo = k.nextInt();
		int widthtwo = k.nextInt();

		int [][]volumetwo= new int [lengthtwo][widthtwo];

		for(int i = 0; i<volumetwo.length;i++) 
		{
			for(int j = 0; j<volumetwo[i].length;j++) 
			{
				System.out.println("Enter value for " + i + " " + j);
				volumetwo[i][j] = k.nextInt();
			}
		}
		// we need to pull the values the user gave us and add them to create the sum
		//so this piece of code shows all the values in the console then adding them together
		int[][]sum = new int[length][width];
		// we need to check if the length and width of both matrix's are the same so I used an if statement to cancel
		// code if they son't match up
		if (length == lengthtwo && width == widthtwo) 
		{
			
			for (int i = 0; i< sum.length; i++ ) 
			{
				for (int j = 0; j<sum[i].length;j++) 
				{	
					System.out.print(volume[i][j]+ " ");
				}
				System.out.println();
			}
			
			System.out.println("+");
			
			for (int i = 0; i< sum.length; i++ ) 
			{
				for (int j = 0; j<sum[i].length;j++) 
				{	
					System.out.print(volumetwo[i][j]+ " ");
				}
				System.out.println();
			}
			
			System.out.println("=");
			
			for (int i = 0; i< sum.length; i++ ) 
			{
				for (int j = 0; j<sum[i].length;j++) 
				{	
					
					sum[i][j]=volume[i][j]+volumetwo[i][j];
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();
			}	
		}
		else 
		{
			System.out.println("Invalid dimensions, these cannot be added.");
		}

	}

}
