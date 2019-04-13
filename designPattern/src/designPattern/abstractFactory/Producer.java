package designPattern.abstractFactory;

public class Producer {
	public static void main(String[] args) {
		IFoodFactory fruitFactory=new FruitFactory();
		IApple apple=fruitFactory.apple();
		apple.produce();
		IOrange orange=fruitFactory.orange();
		orange.produce();
		
	}
}
