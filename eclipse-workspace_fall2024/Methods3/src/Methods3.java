
public class Methods3 {

	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		Methods3 m = new Methods3();
		m.start();
		
	}
	
	
	public void start() 
	{
		System.out.println("Start!");
		method1();
	}
	
	public void method1() 
	{
		System.out.println("one!");
		method2();
	}
	
	public void method2() 
	{
		System.out.println("two!");
		method3();
	}
	
	public void method3() 
	{
		System.out.println("three!");
	}

}
