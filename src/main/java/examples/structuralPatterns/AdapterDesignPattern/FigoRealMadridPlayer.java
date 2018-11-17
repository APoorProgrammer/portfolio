package examples.structuralPatterns.AdapterDesignPattern;

public class FigoRealMadridPlayer implements RealMadridPlayer {

	BarcelonaPlayer barcelonaPlayer;
	
	public FigoRealMadridPlayer(BarcelonaPlayer barcelonaPlayer) {
		this.barcelonaPlayer = barcelonaPlayer;
	}
	
	@Override
	public void madePresentation() {
		barcelonaPlayer.madePresentation();
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
