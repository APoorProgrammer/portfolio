package examples.behaviouralPatterns.templateMethodPattern;

public class LaLiga extends ALeagueFootball {

	@Override
	public void cupDraw() {
		System.out.println("We play a cup's double qualification match ");
	}

	@Override
	public void calendarLeaguerDraw() {
		System.out.println("We play with a symmetric calendar league...well not yet :(");
	}

	@Override
	public void myleague() {
		System.out.println("---------------------------------");
		System.out.println("We are LA LIGA: ");
	}

	@Override
	public void farewell() {
		System.out.println("¡¡¡Adiós!!!");
		System.out.println("---------------------------------");
	}
	
}
