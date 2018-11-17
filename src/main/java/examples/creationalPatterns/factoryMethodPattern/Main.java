package examples.creationalPatterns.factoryMethodPattern;

public class Main {

	public static void main(String[] args) {
		FormedPlayerType goalKeeper = RealMadridYouthAcademy.getFormedPlayer(FormedPlayerType.TYPE.GOALKEEPER.toString());
		goalKeeper.getWhatDoYouKnowToDo();
		FormedPlayerType defence = RealMadridYouthAcademy.getFormedPlayer(FormedPlayerType.TYPE.DEFENSE.toString());
		defence.getWhatDoYouKnowToDo();
	}

}
