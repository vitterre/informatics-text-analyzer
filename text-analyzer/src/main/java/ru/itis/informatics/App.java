package ru.itis.informatics;

import com.beust.jcommander.Parameter;
import ru.itis.informatics.opener.FileOpener;
import ru.itis.informatics.statement.Processor;
import ru.itis.informatics.tools.ExtensionParser;


public final class App {

	/* ----- Arguments ----- */

	@Parameter(names = {"--filepath", "-f"},
					description = "The path of the file to analyze.",
					required = true,
					order = 0)
	private String filePath;

	@Parameter(names = {"--mostPopularWords", "-m"},
					description = "Amount of the most popular words that will be displayed.",
					order = 1)
	private Integer amountOfWords = 100;

	@Parameter(names = {"--benchMarking", "-b"},
					description = "Enable benchmarking.",
					order = 2)
	private boolean enableBenchMarking = false;

	@Parameter(names = {"--help", "-h"},
					description = "Display usage information.",
					order = 3)
	private boolean displayUsageInformation = false;

	/* ----- Public methods ----- */

	/**
	 * The main application method.
	 *
	 * @throws Exception if some error with unsupported
	 *                   file extension occurs
	 */
	public void run() throws Exception {
		final long start = System.nanoTime();

		final FileOpener fileOpener =
						ExtensionParser.getOpenerModel(filePath);

		final Processor processor = new Processor(fileOpener);

		System.out.println("* ----- Text Analyzer ----- *");
		System.out.println("* Unique words: " + processor.getUniqueWordsMap().size());

		System.out.println("* The " + amountOfWords + " most popular words in the text:");
		processor.printTheMostPopularWords(amountOfWords);

		final long end = System.nanoTime();

		if (enableBenchMarking) {
			System.out.println("* Estimated time: " + (end - start));
		}
	}

	public boolean mustDisplayUsageInfo() {
		return this.displayUsageInformation;
	}

}
