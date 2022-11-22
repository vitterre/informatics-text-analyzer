package ru.itis.informatics;

import java.io.IOException;
import ru.itis.informatics.reader.FileReader;
import ru.itis.informatics.reader.extensions.ReaderTXT;

public final class Main {
	public static void main(String[] args) throws IOException {
		final FileReader fileReader = new FileReader("resources/text.txt", new ReaderTXT());

		System.out.println(fileReader.getWords());
	}
}