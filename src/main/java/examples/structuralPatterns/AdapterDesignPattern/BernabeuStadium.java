package examples.structuralPatterns.AdapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BernabeuStadium {

	List<RealMadridPlayer> players = new ArrayList<>();

	public List<RealMadridPlayer> getPlayers() {
		return players;
	}

	public void addPlayer(RealMadridPlayer player) {
		players.add(player);
	}
	
	public void madePlayerPresentation() {
		for(RealMadridPlayer player: players) {
			player.madePresentation();
			player.kissRealMadridBadge();
			player.sayHalaMadrid();
		}
	}
	
}
