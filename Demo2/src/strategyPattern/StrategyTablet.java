package strategyPattern;

public class StrategyTablet extends Product implements Strategy {

	@Override
	public void show() {
		super.show();
		System.out.println("This is Tablet Details.");
		
	}

}
