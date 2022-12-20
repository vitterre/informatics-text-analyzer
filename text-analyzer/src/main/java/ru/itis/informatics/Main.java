package ru.itis.informatics;

import ru.itis.informatics.analyzer.mapmaker.WordsMap;
import ru.itis.informatics.tools.MapFilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	private static String[] tempArray = {"abvcacasdasdas", "qweqwe", "zxczxc", "QWEQWE", "abvcacasdasdas", "hfdhdfhdhdh", "gsgdgsgsd", "sdgsdgsdgsdgsd", "gdgsdngngfnfgn", "sfhfhtsdhdh", "ahfmmfnwrwe"};

	public static void main(String[] args) {
		final Map<String, Integer> uniqueWordsMap = WordsMap.getWordsMap(new ArrayList<>(List.of(tempArray)));

		System.out.println("Unique words: " + uniqueWordsMap.size());
		final int amountOfTheMostPopularWords = 5;

		System.out.println("" + amountOfTheMostPopularWords + " the most popular words:");

		Map<String, Integer> sortedUniqueMap = MapFilter.sortReversed(uniqueWordsMap);
		Iterator<Map.Entry<String, Integer>> iterator = sortedUniqueMap.entrySet().iterator();


		for (int i = 0; i < amountOfTheMostPopularWords; ++i) {
			if (iterator.hasNext()) {
				Map.Entry<String, Integer> entry = iterator.next();
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}
