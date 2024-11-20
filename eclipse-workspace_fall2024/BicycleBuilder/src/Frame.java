/*
 * Tyler Bouldin
 */
public class Frame {
	
	private double size;
	private String type;
	
	public Frame() 
	{
		this.size = 18.5;
		this.type = "Diamond";
	}
	
	public Frame(double size, String type) 
	{
		setSize(size);
		setType(type);
	}
	
	
	
	public double getSize() 
	{
		return this.size;
	}
	
	public String getType() 
	{
		return this.type;
	}
	
	public void setSize(double size) 
	{
		if (size >=18.5 && size <= 60) 
		{
			this.size = size;
		}
		else 
		{
			this.size= 18.5;
		}
	}
	
	public void setType(String type) 
	{
		String [] types = {"Diamond","Step-Through","Truss","Penny-Farthing"};
// saying that these are the only values that type can be using an array
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
			this.type = "Diamond";
		}
	}
	
	// equals method which makes sure all of the value from get and set are equal
	public boolean equals(Frame f)
	{
		if (this.size == f.getSize() && this.type == f.getType()) 
		{ 
			return true; 
		} 
		else
		{ 
			return false; 
		} 
	}
	
	// a to string to format the console easier with less coding
	public String toString() 
	{
		return "[Frame] Size: " + getSize() + " Type: " + getType();
	}
}
