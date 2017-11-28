package strategyPattern;

public class Product implements Strategy{

	@Override
	public void show() {
		System.out.print("My product -> ");
	}
		
}
