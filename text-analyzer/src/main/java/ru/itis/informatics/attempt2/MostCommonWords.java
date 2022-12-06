package ru.itis.informatics.attempt2;

import java.util.*;

import static ru.itis.informatics.attempt2.Counter.tempMap;

public class MostCommonWords {

	public static HashMap<String, Integer> task2() {
		HashMap<String, Integer> frequentWords = new HashMap<>();
		HashMap<String, Integer> copyOfTempMap = new HashMap<>(tempMap);
//
//		for (int i=0; i<100; i++) {
//			int maximum = (Collections.max(copyOfTempMap.values()));
//
//
//			for (Map.Entry<String, Integer> count : copyOfTempMap.entrySet()) {
//				if (count.getValue() == maximum) {
//					frequentWords.put(count.getKey(), maximum);
//					copyOfTempMap.remove(count.getKey(), maximum);
//				}
//			}
//		}

		List<Integer> valuesOfWords = new ArrayList<>(tempMap.values());
		Collections.sort(valuesOfWords);
		Collections.reverse(valuesOfWords);

		for(int x=0; x<100; x++) {
			for (Map.Entry<String, Integer> count: copyOfTempMap.entrySet()){
				if (valuesOfWords.indexOf(x) == count.getValue()) frequentWords.put(count.getKey(), valuesOfWords.indexOf(x));
			}
		}
	return frequentWords;
	}
}