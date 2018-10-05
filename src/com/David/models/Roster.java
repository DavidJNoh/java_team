package com.David.models;
import java.util.ArrayList;

public class Roster {
	private ArrayList<Team> teams = new ArrayList<Team>();
	
	public ArrayList<Team> getTeams(){
		return teams;
	}
	public void setTeams(ArrayList<Team> x) {
		this.teams = x;
	}
	
	public void addteam (Team name) {
		getTeams().add(name);
	}
	public Team getTeam(int index) {
		return teams.get(index);
	}
	
	public void deleteTeam(Team x) {
		int index = teams.indexOf(x);
	}
}
