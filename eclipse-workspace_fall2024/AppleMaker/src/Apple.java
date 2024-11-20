

/*
 * Tyler Bouldin
 */

public class Apple {

	private String type;
	private double weight;
	private double price;

	public Apple ()
	{
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}

	public Apple(String type, double weight, double price) 
	{
		String [] types = {"Red Delicious","Golden Delicious","Gala","Granny Smith"};
		//making sure that these are the only types that can be made.

		boolean isValidType = false; 

		for (String validType : types) 
		{
			if (validType.equals(type)) 
			{
				isValidType = true;
				break;
			}
		}

		if (isValidType) 
		{
			this.type = type;
		}
		else
		{
			this.type = "Gala";
		}

		// checks to see if the weight is between 0-2 then sets the weight to the apple
		if (weight <= 2 && weight >= 0) 
		{
			this.weight = weight;
		}
		else 
		{
			this.weight = 0.0;
		}

		if (price >=0) 
		{
			this.price = price;
		}
		else 
		{
			this.price = 0.0;
		}

	}

	//getters that get the instance variables
	public String getType() 
	{
		return type;
	}

	public double getWeight() 
	{
		return weight;
	}

	public double getPrice() 
	{
		return price;
	}

	public String toString() 
	{
		return "Type: " + type + ", Weight: " + weight + ", Price: " + price;
	}




	public boolean equals(Apple e) 
	{ 
// checking using the .equals to see if all of the instance variable between apple 1 and 3 match up
		if (this.type.equals(e.getType()) && this.weight == e.getWeight() && this.price == e.getPrice()) 
		{ 
			return true; 

		} 
		else
		{ 
			return false; 
		} 



	}


}


