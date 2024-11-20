
import java.util.Scanner;
public class Forloops {

	public static void main(String[] args) {
		//ask user for a number
		//print all of the numbers from 0-their number
		// then ask the user for that many numbers and add them all up
		
		System.out.println("Type in a number");
		Scanner k = new Scanner(System.in);
		int userNumber = k.nextInt();
		
		
		for(int i=0; i<= userNumber;i++) 
		{
			System.out.println(i);
		}
		System.out.println("input "+ userNumber +" numbers");
		
		int finalSum= 0;
		
		for(int i=0; i< userNumber; i++) 
		{
			int num= k.nextInt();
			finalSum+= num;
		}
		System.out.println(finalSum);

	}

}
