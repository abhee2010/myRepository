package com.dreamhome.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tyre {
	
	List<String> myList = new ArrayList<String>();
	Set<String> mySet = new HashSet<String>("hdgsh");
	
	private String name;
	private int size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

}
