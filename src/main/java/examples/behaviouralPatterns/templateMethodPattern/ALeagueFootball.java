package examples.behaviouralPatterns.templateMethodPattern;

public abstract class ALeagueFootball {

	public abstract void cupDraw();
	public abstract void calendarLeaguerDraw();
	public abstract void myleague();
	public abstract void farewell();
	
	public void playLeague() {
		myleague();
		calendarLeaguerDraw();
		cupDraw();
		farewell();
	}
	
}
