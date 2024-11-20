/*
 Written by Tyler Bouldin
 */
package triangleproject;

import java.util.Scanner;

public class Triangleproject {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//importing scanner so the user can input values

		System.out.println("Welcome to the triangle Program");
		System.out.println("Enter the positive height of the triangle");
		//setting up a variable
		int i = 1;
		//this says that whatever the user inputs will be set to the height of the triangle
		int height = keyboard.nextInt();

		while (i<height)
		{
			int asterisksPrinted = 0;
			while(asterisksPrinted<i) 
			{
				System.out.print("*");
				asterisksPrinted++;

			}
			i++;
			//saying that it will add asterisks until a certain point with the ++
			System.out.println("");
		}
		for(i= height-1; i>=0; i--) 
		{
			int asterisksPrinted = 0;
			while(asterisksPrinted<=i) 
			{
				System.out.print("*");
				asterisksPrinted++;
			}
			System.out.println("");
		}
		//for loop for the downward part of the triangle
		System.out.println("Done!");


	}

}
