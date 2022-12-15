package ru.itis.informatics.analyzer;

import java.util.*;

public class Counter {
	public static Map<String, Integer> tempMap = new HashMap<>();
	String[] tempArray = new Finish().getTempArray();

	public int task1() {
		String[] lowTempArray = new String[tempArray.length];

		for (int i = 0; i < tempArray.length; i++) {
			lowTempArray[i] = tempArray[i].toLowerCase();
		}

		for (String word : lowTempArray) {
			if (tempMap.containsKey(word)) tempMap.put(word, tempMap.get(word) + 1);
			else tempMap.put(word, 1);
		}
		return tempMap.size();
	}
}
