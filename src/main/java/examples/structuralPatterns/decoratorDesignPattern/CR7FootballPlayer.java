package examples.structuralPatterns.decoratorDesignPattern;

public class CR7FootballPlayer extends FootballSkillDecorator {

	public CR7FootballPlayer(FootballSkill footballSkill) {
		this.footballSkill = footballSkill;
	}
	
	public void setMyFootballPlayerSkillExtra(FootballSkill footballSkill) {
		this.footballSkill = footballSkill;
	}
	
	@Override
	public void mySkill() {
		footballSkill.mySkill();
		System.out.println(" and he is very fast!!!");
		System.out.println(" so he is better than Messi!!!");
	}

}
