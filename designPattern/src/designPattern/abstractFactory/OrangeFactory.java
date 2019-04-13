package designPattern.abstractFactory;

public class OrangeFactory implements IOrange {

	@Override
	public void produce() {
		System.out.println("OrangeFactory produce oranges");
	}

}
