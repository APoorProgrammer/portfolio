package examples.behaviouralPatterns.strategyPattern;

public class Main {

	public static void main(String[] args) {
		Gala gala = new Gala(new CR7());
		gala.getTheGoldeBallTo();
		gala.setGoldenBall(new Messi());
		gala.getTheGoldeBallTo();
	}

}
