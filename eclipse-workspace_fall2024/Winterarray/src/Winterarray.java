/*
 Tyler Bouldin
 */


import java.util.Scanner;

public class Winterarray {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.println("Welecome to the below average temperature program");


		int days = 1;
		double[] temp = new double[10];

		for(int i = 0; i< temp.length; i++) 
		{
			System.out.println("What was the temperature of Day " + (i+1));
			temp[i] = k.nextDouble();
		}

		double sum = 0;
		for(int i = 0; i< temp.length; i++ ) 
		{
			sum += (temp[i]);
		}

		double average = sum/10;
		System.out.println("The average temperature was " + average);
		System.out.println("The days that are below average were ");
		for(int i = 0; i < temp.length; i++)
		{
			if(temp[i]< average) 
			{
				System.out.println("Day " + (i+1) + " with " + (temp[i]));
			}
		}

	}

}
