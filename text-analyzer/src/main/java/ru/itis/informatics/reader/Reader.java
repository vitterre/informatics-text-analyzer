package ru.itis.informatics.reader;

import java.util.ArrayList;
import java.util.List;

public final class Reader {

	/* ----- Private / protected methods ----- */

	/**
	 * Converts a string from a file into an array
	 * consisting of words from this string without
	 * punctuation and other characters.
	 *
	 * @param line raw line from the file
	 * @return an array of words of the current line
	 */
	private List<String> getReadableLineFrom(final String line) {
		// Will contain pure strings
		final List<String> fixedLines = new ArrayList<>();

		for (final String rawLine : List.of(line.split("[,.\"'*(){}?!_:;</>«»‘’ -]"))) {
			// Checks if string contains letters only
			if (rawLine.matches("^[a-zA-Zа-яА-Я]+$")) {
				fixedLines.add(rawLine);
			}
		}

		return new ArrayList<>(fixedLines);
	}


	/* ----- Public methods ----- */

	/**
	 * Converts all rows of a file into an array containing
	 * words without any punctuation or other characters.
	 *
	 * @param lines an array of text lines
	 * @return an array of words of all lines
	 */
	public List<String> getReadableLinesFrom(final List<String> lines) {
		// Will contain pure words only
		final List<String> trueWordLines = new ArrayList<>();

		for (final String line : lines) {
			trueWordLines.addAll(getReadableLineFrom(line));
		}

		return new ArrayList<>(trueWordLines);
	}

}
