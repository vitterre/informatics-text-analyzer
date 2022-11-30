package ru.itis.informatics.opener;

import ru.itis.informatics.reader.Reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class FileOpenerTXT extends FileOpener {

	final List<String> lines;

	public FileOpenerTXT(final String filePath) throws IOException {
		this.lines = Files.readAllLines(Paths.get(filePath));
	}

	@Override
	public List<String> getWords() {
		return new ArrayList<>(new Reader().getReadableLinesFrom(lines));
	}
}
