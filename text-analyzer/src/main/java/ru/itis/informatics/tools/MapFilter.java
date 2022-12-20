package ru.itis.informatics.tools;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class is a utility class that
 * contains methods of filtering and
 * sorting data structures such as Map.
 */
public final class MapFilter {

	/**
	 * Sorts the Map by values in descending
	 * order.
	 *
	 * @param unsortedMap unsorted Map object
	 * @return reversed sorted Map object
	 */
	public static Map<String, Integer> sortReversed(final Map<String, Integer> unsortedMap) {
		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

		unsortedMap.entrySet()
				.stream().
				sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(el -> reverseSortedMap.put(el.getKey(), el.getValue()));

		return reverseSortedMap;
	}
}
