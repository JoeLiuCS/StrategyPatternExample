package strategyPattern;

import java.util.HashMap;
import java.util.Map;

public class ContextProduct {
	// FlyWeight Pattern
	private static Map<String,Product> strategy_flyweight= new HashMap<>();
	
	public static Product getProduct(String productName){
		
		Product strategy_product = strategy_flyweight.get(productName);
		
		// The new Item needs to create
		if(strategy_product == null){
			// Factory Pattern
			switch (productName){
				case "Computer":
					Product strategyA = new StrategyComputer();
					strategy_product = strategyA;
					strategy_flyweight.put(productName, strategy_product);		
					break;
				case "Tablet":
					Product strategyB = new StrategyTablet();
					strategy_product = strategyB;
					strategy_flyweight.put(productName, strategy_product);
					break;
				case "Phone":
					Product strategyC= new StrategyPhone();
					strategy_product = strategyC;
					strategy_flyweight.put(productName, strategy_product);
					break;
				default:
					throw new IllegalArgumentException("wrong!");
			}
		}
		System.out.println("\nObject number : "+strategy_flyweight.size());
		return strategy_product;
	}

}
