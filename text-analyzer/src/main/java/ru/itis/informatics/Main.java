package ru.itis.informatics;

import ru.itis.informatics.analyzer.mapmaker.WordsMap;
import ru.itis.informatics.opener.FileOpener;
import ru.itis.informatics.opener.FileOpenerTXT;
import ru.itis.informatics.tools.MapFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		final FileOpener fileOpener = new FileOpenerTXT("text-analyzer/src/resources/text.txt");

		// Get words from the file
		final List<String> words = fileOpener.getWords();

		// Get unique words map
		final Map<String, Integer> uniqueWordsMap = WordsMap.getWordsMap(words);

		System.out.println("Unique words: " + uniqueWordsMap.size());
		final int amountOfTheMostPopularWords = 5;

		System.out.println("" + amountOfTheMostPopularWords + " the most popular words:");

		Map<String, Integer> sortedUniqueMap = MapFilter.sortReversed(uniqueWordsMap);
		Iterator<Map.Entry<String, Integer>> iterator = sortedUniqueMap.entrySet().iterator();

		// Print the most popular words
		for (int i = 0; i < amountOfTheMostPopularWords; ++i) {
			if (iterator.hasNext()) {
				Map.Entry<String, Integer> entry = iterator.next();
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}