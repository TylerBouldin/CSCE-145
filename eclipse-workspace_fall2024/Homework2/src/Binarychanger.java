

/*
 * Tyler Bouldin
 */
// importing math util so that I can use exponents
import java.lang.Math;
import java.util.Scanner;

public class Binarychanger {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.println("Enter a four digit binary number");
		String converter = k.nextLine();
		
		int result = 0;
		
		
		char first = converter.charAt(0);
		char second = converter.charAt(1);
		char third = converter.charAt(2);
		char fourth = converter.charAt(3);
		
		// looking at the first index of the binary to see if it equals 1
		// then if it does multipying it by the correct exponent
		if (converter.charAt(0) == '1') 
		{
	        int value = Character.getNumericValue(first);
	        result+= value * Math.pow(2, 3);
	        //using math pow to multiply the first number 
		}
		else if (converter.charAt(0) < '1' || converter.charAt(0) > '1')
		{
			// if its anything other than one  it will bring the user to this screen or if it is 
			result += 0;
		}
		
		
		if (converter.charAt(1) == '1') 
		{
	        int value = Character.getNumericValue(second);
	        result += value * Math.pow(2, 2);
		}
		else if (converter.charAt(1) < '1' || converter.charAt(1) > '1')
		{
			result += 0;
		}
		
		
		if (converter.charAt(2) == '1') 
		{
	        int value = Character.getNumericValue(third);
	        result += value * Math.pow(2, 1);
		}
		else if (converter.charAt(2) < '1' || converter.charAt(2) > '1')
		{
			result += 0;
		}
		

		if (converter.charAt(3) == '1') 
		{
	        int value = Character.getNumericValue(fourth);
	        result += value * Math.pow(2, 0);
		}
		else if (converter.charAt(3) < '1' || converter.charAt(3) > '1')
		{
			result += 0;
		}
		
		
		
		
		
		
		System.out.println("Enter another four digit binary number");
		String converter2 = k.nextLine();
		
		int result2 = 0;
		
		
		if (converter2.charAt(0) == '1') 
		{
			char first2 = converter2.charAt(0);
	        int value = Character.getNumericValue(first2);
	        result2 += value * Math.pow(2, 3);
		}
		else if (converter2.charAt(0) < '1' || converter2.charAt(0) > '1')
		{
			result2 += 0;
		}
		
		
		if (converter2.charAt(1) == '1') 
		{
			char second2 = converter2.charAt(1);
	        int value = Character.getNumericValue(second2);
	        result2 += value * Math.pow(2, 2);
		}
		else if (converter2.charAt(1) < '1' || converter2.charAt(1) > '1')
		{
			result2 += 0;
		}
		
		
		if (converter2.charAt(2) == '1') 
		{
			char third2 = converter2.charAt(2);
	        int value = Character.getNumericValue(third2);
	        result2 += value * Math.pow(2, 1);
		}
		else if (converter2.charAt(2) < '1' || converter2.charAt(2) > '1')
		{
			result2 += 0;
		}
		

		if (converter2.charAt(3) == '1') 
		{
			char fourth2 = converter2.charAt(3);
	        int value = Character.getNumericValue(fourth2);
	        result2 += value * Math.pow(2, 0);
		}
		else if (converter2.charAt(3) < '1' || converter2.charAt(3) > '1')
		{
			result2 += 0;
		}
		
		// printing out the results
		System.out.println("Your first number is " + result);
		System.out.println("Your second number is " + result2);
		int sum = result + result2;
		System.out.println ("added together equal " + sum);
		
	

	}

}