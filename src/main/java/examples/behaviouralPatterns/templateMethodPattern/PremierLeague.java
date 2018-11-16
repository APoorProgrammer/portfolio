package examples.behaviouralPatterns.templateMethodPattern;

public class PremierLeague extends ALeagueFootball {

	@Override
	public void cupDraw() {
		System.out.println("We play a cup's single qualification match  ");
	}

	@Override
	public void calendarLeaguerDraw() {
		System.out.println("We play with a asymmetric calendar league");
	}

	@Override
	public void myleague() {
		System.out.println("---------------------------------");
		System.out.println("We are PREMIER LEAGUE: ");
	}

	@Override
	public void farewell() {
		System.out.println("Bye Bye!!!");
		System.out.println("---------------------------------");
	}

}
