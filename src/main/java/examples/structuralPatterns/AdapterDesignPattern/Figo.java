package examples.structuralPatterns.AdapterDesignPattern;

public class Figo implements BarcelonaPlayer {

	@Override
	public void madePresentation() {
		System.out.println("I'm Luis Figo");
	}

	@Override
	public void kissBarcelonaBadge() {
		System.out.println("Kiss Barcelona Badge!!!");
	}

	@Override
	public void sayViscaBarcaAndViscaCatalonia() {
		System.out.println("Visca el Barça and Visca Catalonia!!!");
	}

}
