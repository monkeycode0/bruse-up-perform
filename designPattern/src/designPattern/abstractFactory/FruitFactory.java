package designPattern.abstractFactory;

public class FruitFactory implements IFoodFactory {

	@Override
	public IApple apple() {
		return new AppleFactory();
	}

	@Override
	public IOrange orange() {
		return new OrangeFactory();
	}


}
