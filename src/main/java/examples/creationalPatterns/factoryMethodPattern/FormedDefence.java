package examples.creationalPatterns.factoryMethodPattern;

public class FormedDefence implements FormedPlayerType {

	@Override
	public void getWhatDoYouKnowToDo() {
		System.out.println("I defence very well and I don't allow scores by opponents.");
	}

}
