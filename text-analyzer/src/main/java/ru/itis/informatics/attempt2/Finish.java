package ru.itis.informatics.attempt2;

public class Finish {
	public String[] tempArray = {"abvcacasdasdas", "qweqwe", "zxczxc", "QWEQWE", "abvcacasdasdas"};
	
	public String[] getTempArray(){
		return tempArray;
	}

	public static void main(String[] args) {

		Counter counter = new Counter();
		var wordsAndCounts = counter.task1();
		System.out.println(wordsAndCounts + "unique words in the text");

//		MostCommonWords part2 = new MostCommonWords();
		System.out.println(MostCommonWords.task2());
	}
}
