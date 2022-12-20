package ru.itis.informatics.opener;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import ru.itis.informatics.reader.Reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class FileOpenerPDF extends FileOpener {

	final List<String> lines;

	public FileOpenerPDF(final String filePath) throws IOException {
		final PDDocument document = PDDocument.load(new File(filePath));
		final String text = new PDFTextStripper().getText(document);
		this.lines = List.of(text.split("\n"));
	}

	@Override
	public List<String> getWords() {
		return new ArrayList<>(new Reader().getReadableLinesFrom(lines));
	}

}
