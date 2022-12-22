package ru.itis.informatics;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

/**
 * Benchmarking results:
 * Raw words:          8 151 917
 * Unique words:       1 083 041 (9 234 958)
 * Amount of words:      771 084 (10 006 042)
 * Sorted words:       4 057 125 (14 063 167)
 * Most popular (2):   5 878 708 (19 941 875)
 * Estimated time:     19 941 875 ~= 0.02 seconds
 */

public final class Main {

	/* ----- Public methods ----- */

	public static void main(final String[] args) throws Exception {
		final App app = new App();
		// We use JCommander in order to easily parse
		// command line arguments
		final JCommander jCommander = JCommander.
						newBuilder().
						addObject(app).
						build();

		if (!app.mustDisplayUsageInfo()) {
			try {
				jCommander.parse(args);
				app.run();
			} catch (ParameterException parameterException) {
				jCommander.usage();
			}
		} else {
			jCommander.usage();
		}
	}

}