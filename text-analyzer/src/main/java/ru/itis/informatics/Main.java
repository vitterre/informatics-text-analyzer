package ru.itis.informatics;

import ru.itis.informatics.opener.FileOpenerPDF;

import java.io.IOException;
import java.util.List;

public final class Main {

	/* ----- Entry point ----- */

	public static void main(String[] args) throws IOException {
		final FileOpenerPDF fileOpenerPDF = new FileOpenerPDF("text-analyzer/src/resources/chekhov.pdf");

		System.out.println(fileOpenerPDF.getWords().size());
	}

}