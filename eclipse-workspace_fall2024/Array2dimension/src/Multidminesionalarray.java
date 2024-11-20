



public class Multidminesionalarray {

	public static void main(String[] args) {
		
		int[][]array2d = new int[2][3];
		
		//first value (0) is saying which value we are working with (0 or 1)
		// second value (1) is saying which element in that array we are working with
		//array2d[0][1] = 5;
		
		for (int i = 0; i < array2d.length; i++) 
		{
			for(int j = 0; j < array2d[i].length; j++) 
			{
				array2d[i][j] = j;
			}
		}

		for (int i = 0; i < array2d.length; i++) 
		{
			for(int j = 0; j < array2d[i].length; j++) 
			{
				System.out.println(array2d[i][j]);
			}
		}
		
		System.out.println();

	}

}



// int[][] array 2d = {{0,1,2},{0,1,2}}

