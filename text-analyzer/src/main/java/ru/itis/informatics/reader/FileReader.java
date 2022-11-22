package ru.itis.informatics.reader;

import ru.itis.informatics.reader.extensions.Reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class FileReader {

	private final List<String> words;

	public FileReader(final String filePath, final Reader reader) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(filePath));
		this.words = reader.getReadableLinesFrom(lines);
	}

	public List<String> getWords() {
		return new ArrayList<>(words);
	}
}
