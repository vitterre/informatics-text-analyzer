package ru.itis.informatics.analyzer;

import java.util.HashMap;

public class Analyzer {
	String[] arrayOfWords = {"wasd", "abc", "zxczxc", "zxczxc", "attention"};
	HashMap<String, Integer> wordsAndCounts = new HashMap<>();
	int counter = 0;


public void checker(){
	for (int i = 0; i<arrayOfWords.length; i++){
		if (wordsAndCounts.containsKey(arrayOfWords[i])) {
			counter =  wordsAndCounts.get(arrayOfWords[i]) + 1;
			wordsAndCounts.put(arrayOfWords[i], counter);
			counter = 0;
		}
		else wordsAndCounts.put(arrayOfWords[i], 1);
		}
	System.out.println(wordsAndCounts);
	}
}