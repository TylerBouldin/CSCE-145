
public class Cat {
	
	private String name;
	private double weight;
	private int numberOfLegs;
	
	public Cat() 
	{
		// default constructor
		this.name= "none";
		this.weight = 1.0;
		this.numberOfLegs = 4;
	}
	
	public Cat (String aN,double aW, int aL) 
	{
		this.name = aN;
		this.weight =aW;
		this.numberOfLegs =aL;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setWeight(double weight) 
	{
		if (weight<= 0)
		{
			this.weight = 1;
		}
		this.weight = weight;
	}
	
	public int getNumberOfLegs() 
	{
		return this.numberOfLegs;
	}
	
	public void setNumberOfLegs(int numberOfLegs) 
	{
		if (numberOfLegs <0)
		{
			this.numberOfLegs = numberOfLegs * -1;
		}
		this.numberOfLegs = numberOfLegs;
	}
	
	
	
	
	
	
	
	
}

