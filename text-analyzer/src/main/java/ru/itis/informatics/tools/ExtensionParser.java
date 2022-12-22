package ru.itis.informatics.tools;

import org.apache.commons.io.FilenameUtils;
import ru.itis.informatics.opener.FileOpener;
import ru.itis.informatics.opener.FileOpenerPDF;
import ru.itis.informatics.opener.FileOpenerTXT;

public final class ExtensionParser {

	public static FileOpener getOpenerModel(final String filePath) throws Exception {
		// Get file extension
		final String fileExtension = FilenameUtils.getExtension(filePath);
		// Get a particular file opener class
		// by parsing the file extension
		switch (fileExtension) {
			case "txt" -> {
				return new FileOpenerTXT(filePath);
			}
			case "pdf" -> {
				return new FileOpenerPDF(filePath);
			}
			default -> {
				throw new Exception("Unsupported file extension");
			}
		}
	}

}
