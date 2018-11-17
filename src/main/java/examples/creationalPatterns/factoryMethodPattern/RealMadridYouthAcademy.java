package examples.creationalPatterns.factoryMethodPattern;

public class RealMadridYouthAcademy {

	public static FormedPlayerType  getFormedPlayer(String formedPlayerType) {
		if (formedPlayerType.equals(FormedPlayerType.TYPE.GOALKEEPER.toString())) {
			return new FormedGoalKeeper();
		} else if (formedPlayerType.equals(FormedPlayerType.TYPE.DEFENSE.toString())) {
			return new FormedDefence();
		}
		return null;
	}
	
}
