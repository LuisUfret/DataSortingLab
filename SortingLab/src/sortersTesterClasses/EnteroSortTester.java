package sortersTesterClasses;

import dataGenerator.DataGenerator;
import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class EnteroSortTester {

	static SelectionSortSorter<Entero> sorter = new SelectionSortSorter<>();
	
	
	public static void main(String[] args) {
		
		DataGenerator generate = new DataGenerator(20);
		Integer[] data = generate.generateData();
		Entero[] sampleArray = new Entero[20];
		
		for(int i=0; i<sampleArray.length; i++) {
			sampleArray[i]= new Entero(data[i]);
			System.out.println(data[i]);
		}
		sorter.sort(sampleArray, null);

	}

}
