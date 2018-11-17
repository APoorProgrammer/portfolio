package examples.structuralPatterns.AdapterDesignPattern;

public class Raul implements RealMadridPlayer {

	@Override
	public void madePresentation() {
		System.out.println("I'm Raúl González");
	}

	@Override
	public void kissRealMadridBadge() {
		System.out.println("Kiss Real Madrid Badge!!!");
	}

	@Override
	public void sayHalaMadrid() {
		System.out.println("Hala Madrid!!!");
	}

}
