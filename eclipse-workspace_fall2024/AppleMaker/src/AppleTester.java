
/*
 * Tyler Bouldin
 */

public class AppleTester {

	public static void main(String[] args) {

		System.out.println("Welcome to the apple tester");
		System.out.println("");
		System.out.println("Creating a default apple's value");
		
		Apple Apple1 = new Apple();
		
		System.out.println(Apple1.toString());
		
		Apple Apple2 = new Apple("Granny Smith",0.75,.99);
		
		System.out.println("Creating another apple");
		System.out.println("Setting the new apple's values to the following, valid values");
		System.out.println("\"Granny Smith\", 0.75, .99");
		System.out.println("Printing the new apples values");
		
		
		System.out.println(Apple2.toString());
		
		//using two string to format the response to the console
		Apple Apple3 = new Apple("iPad", 2.5, -200);
		
		System.out.println("Creating another apple");
		System.out.println("Then setting the new apples values to the following, invalid values,");
		System.out.println("\"iPad\" 2.5 -200");
		System.out.println("Printing the newest apple's values which should not have changed from the default");


		System.out.println(Apple3.toString());
		
		
		
		System.out.println("Checking if the first and last apples have the same value");
		System.out.println(Apple1.equals(Apple3));
		
	}

}
