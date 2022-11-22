package ru.itis.informatics.reader.implementations;

import ru.itis.informatics.reader.Reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class ReaderTXT extends Reader {

	/* ----- Private / protected methods ----- */

	@Override
	protected List<String> getReadableLineFrom(final String line) {
		// Will contain pure strings
		final List<String> fixedLines = new ArrayList<>();

		for (final String rawLine : List.of(line.split("[,.\"'*(){}?!_:;</> -]"))) {
			// Checks if string contains letters only
			if (rawLine.matches("^[a-zA-Zа-яА-Я]+$")) {
				fixedLines.add(rawLine);
			}
		}
		
		return new ArrayList<>(fixedLines);
	}


	/* ----- Public methods ----- */

	@Override
	public List<String> getReadableLinesFrom(final String filePath) throws IOException {
		final List<String> lines = Files.readAllLines(Paths.get(filePath));

		// Will contain pure words only
		final List<String> trueWordLines = new ArrayList<>();

		for (final String line : lines) {
			trueWordLines.addAll(getReadableLineFrom(line));
		}

		return new ArrayList<>(trueWordLines);
	}

}
