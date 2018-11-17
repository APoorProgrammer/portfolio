package examples.structuralPatterns.AdapterDesignPattern;

public class Main {

	public static void main(String[] args) {
		System.out.println("Before Figo plays Real Madrid: ");
		Figo luisFigo = new Figo();
		luisFigo.madePresentation();
		luisFigo.kissBarcelonaBadge();
		luisFigo.sayViscaBarcaAndViscaCatalonia();
		System.out.println("After when he trade to Real Madrid: ");
		FigoRealMadridPlayer luisFigoRM = new FigoRealMadridPlayer(luisFigo);
		Raul raul = new Raul();
		BernabeuStadium bernabeuStadium = new BernabeuStadium();
		bernabeuStadium.addPlayer(raul);
		bernabeuStadium.addPlayer(luisFigoRM);
		bernabeuStadium.madePlayerPresentation();
	}

}
