
public class Recap {

	public void print(String s) 
	{
		System.out.println(s);
	}
	
	
	public double inchesToCenti(double inches) 
	{
		
		return inches * 2.54;
	}

	
	
	public static void main(String[] args) {
		
		Recap r = new Recap();
		r.print("hello");
		
		double inches = 2;
		double centi = inches * 2.54;
		r.print(centi +"");
		
		r.print(r.inchesToCenti(inches)+ "");
	}

}
