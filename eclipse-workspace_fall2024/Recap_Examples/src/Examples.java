import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Please type in a number");
		int num1 = k.nextInt();
		System.out.println("Please type in another number");
		int num2 = k.nextInt();
		
		
		if(num1 > num2) 
		{
			System.out.println(num1+ " > "+ num2);
		}
		else if (num1==num2) 
		{
			System.out.println(num1+ " = "+ num2 );
		}
		else 
		{
			System.out.println(num1+ " < " + num2);
		}
	
		System.out.println("Finished");
	}

}
