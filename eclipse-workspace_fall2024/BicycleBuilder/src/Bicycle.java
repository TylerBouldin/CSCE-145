
/*
 * Tyler Bouldin
 */

public class Bicycle {
	
	
	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Frame frame;
	// adding instance variables based on the other classes I made
	
	public Bicycle() 
	{
		this.make = "none";
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
		this.frame = new Frame();
	}
	
	public Bicycle(String make, Wheel frontWheel,Wheel backWheel, Frame frame) 
	{
		setMake(make);
		setFrontWheel(frontWheel);
		setBackWheel(backWheel);
		setFrame(frame);
	}
	
	
	public String getMake() 
	{
		return make;
	}
	
	public Wheel getFrontWheel() 
	{
		return frontWheel;
	}
	
	public Wheel getBackWheel() 
	{
		return backWheel;
	}
	
	public Frame getFrame() 
	{
		return frame;
	}
	
	
	public void setMake (String make) 
	{
		if (make != null) 
		{
			this.make = make;
		}
		else 
		{
			this.make = "none";
		}
	}
	
	// ensuring that each variable isn't null and saying that if it meets the criteria then it is valid
	
	
	public void setFrontWheel(Wheel frontWheel) 
	{
		if (frontWheel != null) 
		{
			this.frontWheel= frontWheel;
		}
		else 
		{
			this.frontWheel = new Wheel();
		}
	}
	
	public void setBackWheel(Wheel backWheel) 
	{
		if (backWheel != null) 
		{
			this.backWheel= backWheel;
		}
		else 
		{
			this.backWheel = new Wheel();
		}
	}
	
	public void setFrame(Frame frame) 
	{
		if (frame != null) 
		{
			this.frame= frame;
		}
		else 
		{
			this.frame = new Frame();
		}
	}
	
	public boolean equals(Bicycle b) 
	{
		if (this.make == b.getMake()) 
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
		return "[Bicycle] Make: " + getMake() + " Front Wheel: " + getFrontWheel() + 
				" Back Wheel: " + getBackWheel() + " Frame: " + getFrame ();
	}
	
}
