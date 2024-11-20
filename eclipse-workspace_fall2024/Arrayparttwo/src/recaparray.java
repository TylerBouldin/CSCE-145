



public class recaparray {

	public static void main(String[] args) {
		
		int [] array = {10,-2,4,12,1,3};
		//int [] arrary = new int [size];
		
		//find max value of this array
		
		// need variable to keep track of current max value
		//need loop to look at all numbers
		
		int max = array[0];
		
		for(int i = 1; i < array.length; i++) 
		{
			if(max < array[i]) 
			{
				max= array [i];
				
			}
		}
		
		System.out.println(max);

	}

}
