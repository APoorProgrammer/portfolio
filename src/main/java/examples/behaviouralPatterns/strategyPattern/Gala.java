package examples.behaviouralPatterns.strategyPattern;

public class Gala {

	private GoldenBall goldenBall;
	
	public Gala(GoldenBall goldenBall) {
		this.goldenBall = goldenBall;
	}
	
	public void getTheGoldeBallTo() {
		goldenBall.getTheWinnner();
	}
	
	public void setGoldenBall(GoldenBall goldenBall) {
		this.goldenBall = goldenBall;
	}
	
}
