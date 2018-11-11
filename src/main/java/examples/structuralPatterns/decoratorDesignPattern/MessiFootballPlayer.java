package examples.structuralPatterns.decoratorDesignPattern;

public class MessiFootballPlayer extends FootballSkillDecorator {

	public MessiFootballPlayer(FootballSkill footballSkill) {
		this.footballSkill = footballSkill;
	}
	
	@Override
	public void mySkill() {
		footballSkill.mySkill();
		System.out.println(" and he doesn't consume cocaine...");
	}

}
