package ru.itis.informatics.reader.implementations;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import ru.itis.informatics.reader.Reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class ReaderPDF extends Reader {

	/* ----- Private / protected methods ----- */

	@Override
	protected List<String> getReadableLineFrom(String line) {
		// Will contain pure strings
		final List<String> fixedLine = new ArrayList<>();

		for (final String rawLine : List.of(line.split("[,.\"'*(){}?!_:;</>«»‘’ -]"))) {
			// Checks if string contains letters only
			if (rawLine.matches("^[a-zA-Zа-яА-Я]+$")) {
				fixedLine.add(rawLine);
			}
		}

		return new ArrayList<>(fixedLine);
	}


	/* ----- Public methods ----- */

	@Override
	public List<String> getReadableLinesFrom(final String filePath) throws IOException {
		// Loading a PDF document
		final PDDocument document = PDDocument.load(new File(filePath));

		// Get all text from the PDf document
		final String text = new PDFTextStripper().getText(document);

		// Get lines from the text by splitting in by \n
		final List<String> lines = List.of(text.split("\n"));

		// Will contain pure words only
		final List<String> trueWordLines = new ArrayList<>();

		for (final String line : lines) {
			trueWordLines.addAll(getReadableLineFrom(line));
		}

		return new ArrayList<>(trueWordLines);
	}

}
