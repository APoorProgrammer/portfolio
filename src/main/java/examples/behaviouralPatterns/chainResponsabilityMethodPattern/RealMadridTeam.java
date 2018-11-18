package examples.behaviouralPatterns.chainResponsabilityMethodPattern;

public class RealMadridTeam implements TeamWherePlayerStayed {

	TeamWherePlayerStayed nextTeam;
	
	@Override
	public void setNextTeamInPlayerCareer(TeamWherePlayerStayed nextTeam) {
		this.nextTeam = nextTeam;
	}

	@Override
	public void getTeamName() {
		if(null != nextTeam) {
			System.out.println("I played in Real Madrid");
		}else {
			System.out.println("I finished here my career Real Madrid");
		}
	}

}
