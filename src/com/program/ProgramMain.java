package com.program;

import java.util.HashMap;
import java.util.Map;

public class ProgramMain  {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("1","Matha");
		map.put("2","History");
		Immutable im =new Immutable("Mayur Thube", 31, "Punawale", map);
		Immutable im2 = im; 
		System.out.println("im2 "+im2);
		System.out.println("Name "+im.getName());
		im.getMetadata().put("3", "Language");
		System.out.println("Name "+ im.getMetadata());
	}

}
