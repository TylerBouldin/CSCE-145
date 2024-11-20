
/*
 * Tyler Bouldin
 */

import java.util.Scanner;

public class MainRectangle {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		
		System.out.println("Welcome to the Rectangle Sorting program");
		System.out.println("Please enter how many Rectangles you would like to make");
		
		int sizeOfArray = k.nextInt();
		
		double[][]size = new double [sizeOfArray][2];
		
		for(int i = 0; i< size.length; i++) 
		{
			System.out.println("Enter the height of the rectangle " + (i+1) + "; ");
			size[i][0] = k.nextDouble();
			System.out.println("Enter the width of the rectangle " + (i+1) + "; ");
			size[i][1] = k.nextDouble();
		}
		
		
		System.out.println("Would you like to sort rectangles from largest to smallest, "
				+ "type \"yes\" if you do or \"no\" if you do not");
		String decisionOne = k.nextLine();
		if (decisionOne == "yes") 
		{
			System.out.println("good");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		double [][]sum = new double[sizeOfArray][];
		
        for (int i = 0; i < sum.length; i++)
        {
            double height = size[i][0];
            double width = size[i][1];
            double area = height * width;
         }
		
		
		
//		 for (int i = 0; i < sizeOfArray; i++) 
//		 {
//			System.out.println("Rectangle " + (i + 1) + " - Height: " + size[i][0] + ", Width: " + size[i][1]);
//		 }
		
		
	// System.out.println("Rectangle " + (i + 1) + " - Height: " + height + ", Width: " + width + ", Area: " + area);	
		
		
		
	}
	
	
//	public char decision() 
//	{
//		System.out.println("Type \"a\" if you would like to sort rectangles from largest to smallest");
//	System.out.println("Type \"b\" if you would like to sort rectangles from smallest to largest");
//	System.out.println("Type \"c\" if you would like to display the average area of the rectangles");
//	System.out.println("Type \"d\" if you would like to display the minimum area of the reactangles");
//	System.out.println("Type \"d\" if you would like to display the minimum area of the reactangles");
//	System.out.println("Type [Enter] if you would like to quit the program");
//	
//	String decision = k.nextLine();
//	
//	char[] charArray = decision.toCharArray();
//	
//	for(int i = 0; i<charArray.length;i++) 
//	{
//		char input = charArray[0];
//		System.out.println(input);
//	}
//	
//		
//	}
	
	
}
