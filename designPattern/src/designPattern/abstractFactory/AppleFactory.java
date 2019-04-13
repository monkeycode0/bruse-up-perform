package designPattern.abstractFactory;

public class AppleFactory implements IApple {

	@Override
	public void produce() {
		System.out.println("AppleFactory produce apples");
	}

}
