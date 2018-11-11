package examples.structuralPatterns.decoratorDesignPattern;

public class Main {

	public static void main(String[] args) {
		MaradonaFootballPlayer maradona = new MaradonaFootballPlayer();
		System.out.println("We speak about Maradona: ");
		maradona.mySkill();
		System.out.println("We speak about Messi: ");
		MessiFootballPlayer messi = new MessiFootballPlayer(maradona);
		messi.mySkill();
		System.out.println("We speak about CR7: ");
		CR7FootballPlayer cr7 = new CR7FootballPlayer(maradona);
		cr7.mySkill();
		System.out.println("We speak about CR7 and we are madridistas: ");
		cr7.setMyFootballPlayerSkillExtra(messi);
		cr7.mySkill();
	}
	
	

}


