package ru.itis.informatics.analyzer.mapmaker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class WordsMap {
	public static Map<String, Integer> getWordsMap(final List<String> words) {
		words.replaceAll(String::toLowerCase);

		final Map<String, Integer> wordsMap = new HashMap<>();

		for (final String word : words) {
			if (wordsMap.containsKey(word)) {
				wordsMap.put(word, wordsMap.get(word) + 1);
			} else {
				wordsMap.put(word, 1);
			}
		}

		return wordsMap;
	}
}
