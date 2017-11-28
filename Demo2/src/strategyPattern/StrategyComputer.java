package strategyPattern;

public class StrategyComputer extends Product implements Strategy{
	
	@Override
	public void show() {
		super.show();
		System.out.println("This is Computer Promotion Details.");
	}

}
