package strategyPattern;

public class ContextProduct {
	private Strategy strategy;
	
	public ContextProduct(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void show(){
		strategy.show();
	}
}
