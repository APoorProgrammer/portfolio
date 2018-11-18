package examples.behaviouralPatterns.chainResponsabilityMethodPattern;

public class CastillaTeam implements TeamWherePlayerStayed {

	TeamWherePlayerStayed nextTeam;
	
	@Override
	public void setNextTeamInPlayerCareer(TeamWherePlayerStayed nextTeam) {
		this.nextTeam = nextTeam;
	}

	@Override
	public void getTeamName() {
		if(null != nextTeam) {
			System.out.println("I played in Castilla");
		}else {
			System.out.println("I finished here my career in Castilla");
		}
	}

}
