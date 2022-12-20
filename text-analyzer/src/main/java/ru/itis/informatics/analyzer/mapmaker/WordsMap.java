package ru.itis.informatics.analyzer.mapmaker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class contains methods of creating
 * the Map data structure based on words that
 * represented as a {@code String} array.
 */
public final class WordsMap {
	/**
	 * Creates the Map object that contains only
	 * unique words as keys and the number of
	 * occurrences of these words as values.
	 *
	 * @param words list of not unique words
	 * @return the Map object
	 */
	public static Map<String, Integer> getWordsMap(final List<String> words) {
		// We make all words in lowercase because the array
		// can contain the same words but in a different case
		words.replaceAll(String::toLowerCase);

		final Map<String, Integer> wordsMap = new HashMap<>();

		for (final String word : words) {
			if (wordsMap.containsKey(word)) {
				// If wordsMap already has the particular word
				// we just change its value by increasing it by 1
				wordsMap.put(word, wordsMap.get(word) + 1);
			} else {
				// Otherwise, we create new pair Key -> Value, where
				// the Key is a word and the Value is 1, because we
				// only met that word the first time
				wordsMap.put(word, 1);
			}
		}

		return wordsMap;
	}
}
