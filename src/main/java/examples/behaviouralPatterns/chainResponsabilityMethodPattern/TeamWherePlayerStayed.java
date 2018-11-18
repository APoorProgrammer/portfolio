package examples.behaviouralPatterns.chainResponsabilityMethodPattern;

public interface TeamWherePlayerStayed {

	public void setNextTeamInPlayerCareer(TeamWherePlayerStayed nextTeam);
	
	public void getTeamName();

}
