package com.example;

public class solo {
	
	String name;
	int howlong;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHowlong() {
		return howlong;
	}
	public void setHowlong(int howlong) {
		this.howlong = howlong;
	}
	
	public String toString(){
		return"solo{" + "name=" +name+'\''+", howlong="+howlong+'}';
	}

}
