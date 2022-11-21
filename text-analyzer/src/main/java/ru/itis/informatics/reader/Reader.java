package ru.itis.informatics.reader;

import java.util.List;

public abstract class Reader {

	/* ----- Private / protected methods ----- */

	/**
	 * Converts a string from a file into an array
	 * consisting of words from this string without
	 * punctuation and other characters.
	 *
	 * @param line raw line from the file
	 * @return an array of words of the current line
	 */
	protected abstract List<String> getReadableLineFrom(final String line);


	/* ----- Public methods ----- */

	/**
	 * Converts all rows of a file into an array containing
	 * words without any punctuation or other characters.
	 *
	 * @param lines a raw array from the file
	 * @return an array of words of all lines
	 */
	public abstract List<String> getReadableLinesFrom(final List<String> lines);

}
