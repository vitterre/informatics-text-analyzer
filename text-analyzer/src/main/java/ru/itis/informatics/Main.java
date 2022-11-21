package ru.itis.informatics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("resources/text.txt");
		List<String> lines = Files.readAllLines(path);

		// ...
	}
}