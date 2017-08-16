package com.realdolmen.ood020.proxy;

import java.io.IOException;
import java.util.HashMap;

public class MapProxy implements AbstractMap {

	private String fileName;
	private HashMap<String, String> cache = new HashMap<String, String>();
	private Map map;  //zo leg je de link naar de Map; omdat die dezelfde parameter heeft, kan de proxy dit ook gebruiken.

	public MapProxy(String fileName) throws IOException {
		this.fileName = fileName;

	}
	private Map getMap(){
		if (map == null)
			map = new Map(fileName);
		return map;
		//als je de allereerste keer load, maakt hij de Map map.
	}

	public String find(String key) throws Exception {
		// TODO implement method
		if (cache.containsKey(key)) {
			return cache.get(key);
		} else {
			String value = getMap().find(key);
			cache.put(key, value);
			return value;

		}
	}

	public void add(String key, String value) throws Exception {
		cache.put(key,value);
		getMap().add(key, value);   //zet je info in je cache

	}

	private String get(String key) {
		return (String) cache.get(key);
	}

	private void put(String key, String value) {
		cache.put(key, value);
	}
}
