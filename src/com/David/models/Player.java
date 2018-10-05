package com.David.models;

public class Player {
	private String first_name;
	private String last_name;
	private int age;

	public Player (String x, String y, int z) {
		first_name = x;
		last_name = y;
		age = z;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}
	public int getAge() {
		return age;
	}
}
