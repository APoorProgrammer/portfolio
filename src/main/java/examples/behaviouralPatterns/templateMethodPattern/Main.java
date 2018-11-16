package examples.behaviouralPatterns.templateMethodPattern;

public class Main {

	public static void main(String[] args) {
		ALeagueFootball premierLeague = new PremierLeague();
		premierLeague.playLeague();
		ALeagueFootball laliga = new LaLiga();
		laliga.playLeague();
	}

}
