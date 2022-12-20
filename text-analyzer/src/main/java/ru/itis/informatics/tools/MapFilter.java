package ru.itis.informatics.tools;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MapFilter {
	public static Map<String, Integer> sortReversed(final Map<String, Integer> unsortedMap) {
		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

		unsortedMap.entrySet()
				.stream().
				sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(el -> reverseSortedMap.put(el.getKey(), el.getValue()));

		return reverseSortedMap;
	}
}
