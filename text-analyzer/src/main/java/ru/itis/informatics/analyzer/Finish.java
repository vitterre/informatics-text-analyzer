package ru.itis.informatics.attempt2;

public class Finish {
	public String[] tempArray = {"abvcacasdasdas", "qweqwe", "zxczxc", "QWEQWE", "abvcacasdasdas", "hfdhdfhdhdh", "gsgdgsgsd", "sdgsdgsdgsdgsd", "gdgsdngngfnfgn", "sfhfhtsdhdh", "ahfmmfnwrwe"};
	
	public String[] getTempArray(){
		return tempArray;
	}

	public static void main(String[] args) {

		Counter counter = new Counter();
		var wordsAndCounts = counter.task1();
		System.out.println(wordsAndCounts + " unique words in the text");
		System.out.println();

		System.out.println(MostCommonWords.task2());
	}
}
