package ru.itis.informatics.reader;

import ru.itis.informatics.reader.extensions.Reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * This class reads file using particular reader
 * (see {@link Reader}) and gives you the array
 * of pure words.
 * </p>
 * <p>
 * See an example:
 * </p>
 * <p>
 * {@code
 * final FileReader fileReader =
 * new FileReader("resources/text.txt", new ReaderTXT());
 * }
 * </p>
 * <p>
 * {@code
 * System.out.println(fileReader.getWords());
 * }
 * </p>
 */
public final class FileReader {

	/* ----- Constant fields ----- */

	private final List<String> words;


	/* ----- Constructors ----- */

	/**
	 * Creates an instance of {@code FileReader} class
	 * and fills the {@code words} array with pure words
	 * from the text.
	 *
	 * @param filePath the path of the file
	 * @param reader an instance of {@code Reader}
	 *               class
	 * @throws IOException if occur some troubles
	 * with file reading
	 */
	public FileReader(final String filePath, final Reader reader) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(filePath));
		this.words = reader.getReadableLinesFrom(lines);
	}


	/* ----- Getters ----- */

	public List<String> getWords() {
		return new ArrayList<>(words);
	}
}
