package examples.creationalPatterns.factoryMethodPattern;

public class FormedGoalKeeper implements FormedPlayerType {

	@Override
	public void getWhatDoYouKnowToDo() {
		System.out.println("I don't allow scores by opponents intercept the ball with my hands.");
	}

}
