
public class MainClass {

	public static void main(String[] args) {
		
		
		
		Cat cat1 = new Cat();
		System.out.println(cat1);
		
		Cat cat2 = new Cat("fluffy", 5.0, 3);
		
		System.out.println(cat2.getName());
		
		cat2.setName("FLuffy jr");
		System.out.println(cat2.getName());
		
	}

}
