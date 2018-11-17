package examples.creationalPatterns.factoryMethodPattern;

public interface FormedPlayerType {

	enum TYPE {
		GOALKEEPER, DEFENSE;
	}
	
	public void getWhatDoYouKnowToDo();
	
}
