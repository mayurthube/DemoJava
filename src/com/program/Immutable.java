package com.program;

import java.util.HashMap;
import java.util.Map;

public final class Immutable {
	private final String name;
	private final int age;
	private final String address;
	private final HashMap<String, String> metadata;	
	
	public Immutable(String name, int age, String address, HashMap<String, String> metadata) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		HashMap<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
             metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}

	public HashMap<String, String> getMetadata() {
		HashMap<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
             this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
	}
	
	
}
