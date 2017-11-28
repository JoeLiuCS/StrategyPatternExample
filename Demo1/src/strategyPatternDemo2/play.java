package strategyPatternDemo2;

import strategyPattern.*;

public class play {

	public static void main(String[] args) {
		
		ContextProduct firstProduct = new ContextProduct(new StrategyComputer());
		firstProduct.show();
		
		ContextProduct secondProduct = new ContextProduct(new StrategyTablet());
		secondProduct.show();
		
		ContextProduct thirdProduct = new ContextProduct(new StrategyPhone());
		thirdProduct.show();
		
		ContextProduct fourthProduct = new ContextProduct(new StrategyTablet());
		fourthProduct.show();
		
		ContextProduct fifthProduct = new ContextProduct(new StrategyTablet());
		fifthProduct.show();
		
		ContextProduct sixthProduct = new ContextProduct(new StrategyTablet());
		sixthProduct.show();
	}

}
