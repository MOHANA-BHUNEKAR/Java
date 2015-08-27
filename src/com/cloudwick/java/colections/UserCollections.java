package com.cloudwick.java.colections;

public class UserCollections implements Comparable<UserCollections>{
	
	private int SSN;
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	@Override
	public int compareTo(UserCollections o) {
		// TODO Auto-generated method stub
		return this.SSN-o.SSN;
	}

}
