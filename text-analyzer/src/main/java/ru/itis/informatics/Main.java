package ru.itis.informatics;

import ru.itis.informatics.reader.implementations.ReaderPDF;

import java.io.IOException;
import java.util.List;

public final class Main {

	/* ----- Entry point ----- */

	public static void main(String[] args) throws IOException {
		final ReaderPDF readerPDF = new ReaderPDF();
		List<String> lines = readerPDF.getReadableLinesFrom("text-analyzer/src/resources/chekhov.pdf");

		System.out.println(lines.size());
	}

}