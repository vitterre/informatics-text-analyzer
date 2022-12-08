package ru.itis.informatics.attempt2;

import java.util.*;;

import static ru.itis.informatics.attempt2.Counter.tempMap;

public class MostCommonWords {

	public static String task2() {
		HashMap<String, Integer> copyOfTempMap = new HashMap<>(tempMap);


		for (int i=0; i<100; i++) {
			int maxim = (Collections.max(copyOfTempMap.values()));
			Iterator<Map.Entry<String, Integer>> iter = copyOfTempMap.entrySet().iterator();

				while (iter.hasNext()) {
					Map.Entry<String, Integer> entry = iter.next();
					if (maxim == entry.getValue()) {

						System.out.println(entry.getKey() + " " + maxim);
						iter.remove();
					}
				}
		}
		return "task is completed!!!";
	}
}