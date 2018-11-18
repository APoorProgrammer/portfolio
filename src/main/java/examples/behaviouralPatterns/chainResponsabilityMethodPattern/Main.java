package examples.behaviouralPatterns.chainResponsabilityMethodPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<TeamWherePlayerStayed> playerCareer  = new ArrayList<>();
		playerCareer.add(new CastillaTeam());
		playerCareer.add(new RealMadridTeam());
		playerCareer.add(new OsasunaTeam());
		for(int i = 0; i < playerCareer.size(); i++){
			try {
				playerCareer.get(i).setNextTeamInPlayerCareer(playerCareer.get(i+1));
			}catch (Exception e) {
				playerCareer.get(i).setNextTeamInPlayerCareer(null);
			}
			playerCareer.get(i).getTeamName();
		}
	}

}
