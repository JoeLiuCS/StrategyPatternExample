package strategyPatternDemo1;

import strategyPattern.*;

public class play {
	public static void main(String[] args) {
		Product firstProduct = ContextProduct.getProduct("Computer");
		firstProduct.show();
		
		Product secondProduct = ContextProduct.getProduct("Tablet");
		secondProduct.show();
		
		Product thirdProduct = ContextProduct.getProduct("Phone");
		thirdProduct.show();
		
		Product fourthProduct = ContextProduct.getProduct("Tablet");
		fourthProduct.show();
		
		Product fifthProduct = ContextProduct.getProduct("Tablet");
		fifthProduct.show();
		
		Product sixthProduct = ContextProduct.getProduct("Tablet");
		sixthProduct.show();
	}
}
