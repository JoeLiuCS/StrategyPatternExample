package strategyPattern;

public class StrategyPhone extends Product implements Strategy {

	@Override
	public void show() {
		super.show();
		System.out.println("This is Phone Promotion Details.");
	}

}
