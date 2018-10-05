package com.David.models;

import java.util.ArrayList;

public class Team {
	private String name;
	ArrayList<Player> players = new ArrayList<Player>();
	
	public Team (String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
	
	public void addplayer (Player r) {
		players.add(r);
	}
	
	public void deletePlayer(Player x) {
		int y = players.indexOf(x);
		players.remove(y);
	}
}
