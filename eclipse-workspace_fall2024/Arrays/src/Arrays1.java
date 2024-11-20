
import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		
		// ask user for number
		// ask the user for that many numbers
		// save them to an array
		//print the array one value at a time
		
		Scanner k = new Scanner(System.in);
		System.out.println("How many numbers do you want to save");
		int size= k.nextInt();
		int[] numbers = new int[size];
		
		for (int i =0; i< numbers.length; i++) 
		{
			numbers[i]= k.nextInt();
		}

		for (int i= 0; i < numbers.length; i++) 
		{
			System.out.println("Saved number " + (i +1) + ": ");
			System.out.println(numbers[i]);
		}
		
		
		
	}

}
