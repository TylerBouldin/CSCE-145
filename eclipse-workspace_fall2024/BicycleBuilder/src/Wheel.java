/*
 * Tyler Bouldin
 */
public class Wheel 
{

	private double diameter;
	private double width;
	
	public Wheel ()
	{
		this.diameter = 16;
		this.width = 1;
	}
	
	
	public Wheel (double diameter, double width) 
	{
		setDiameter(diameter);
		setWidth(width);
	}
	
	public double getDiameter() 
	{
		return this.diameter;
	}
	
	public double getWidth() 
	{
		return this.width;
	}
	
	public void setDiameter(double diameter) 
	{
		if (diameter <= 55 && diameter >=16) 
		{
			this.diameter = diameter;
		}
		else 
		{
			this.diameter = 16;
		}
	}
	
	public void setWidth(double width) 
	{
		if (width <= 2.5 && width >=1 ) 
		{
			this.width = width;
		}
		else 
		{
			this.width = 1;
		}
	}
	
	public boolean equals(Wheel w)
	{
		if (this.diameter == w.getDiameter() && this.width == w.getWidth()) 
		{ 
			return true; 
		} 
		else
		{ 
			return false; 
		} 
	}
	
	public String toString() 
	{
		return "[Wheel] Diameter: " + getDiameter() + " Width: " + getWidth();
	}
	
}
