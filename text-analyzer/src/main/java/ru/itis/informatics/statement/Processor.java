package ru.itis.informatics.statement;

import ru.itis.informatics.analyzer.mapmaker.WordsMap;
import ru.itis.informatics.opener.FileOpener;
import ru.itis.informatics.tools.MapFilter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Processor {

	private final Map<String, Integer> uniqueWordsMap;

	public Processor(final FileOpener fileOpener) {
		// Get unique words map
		this.uniqueWordsMap =
						WordsMap.getWordsMap(fileOpener.getWords());
	}

	public Map<String, Integer> getUniqueWordsMap() {
		return new HashMap<>(this.uniqueWordsMap);
	}

	public void printTheMostPopularWords(final int amountOfWords) {
		// We sort unique words map in order to get
		// the most popular words starting by the
		// most popular and ending by less popular
		Map<String, Integer> sortedUniqueWordsMap =
						MapFilter.sortReversed(this.uniqueWordsMap);
		Iterator<Map.Entry<String, Integer>> iterator =
						sortedUniqueWordsMap.entrySet().iterator();

		// Output the most popular words
		for (int i = 0; i < amountOfWords; ++i) {
			if (iterator.hasNext()) {
				Map.Entry<String, Integer> entry = iterator.next();
				System.out.println("  " + entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}
