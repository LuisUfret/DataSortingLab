package sortersTesterClasses;

import sorterClasses.BubbleSortSorter;
import sorterClasses.SelectionSortSorter;

public class AnotherTester {
	
	static BubbleSortSorter<Integer> sorter = new BubbleSortSorter<>();
	
	static IntegerComparator1 comp1 = new IntegerComparator1();
	
	static IntegerComparator2 comp2 = new IntegerComparator2();
	
	public static void main(String[] args) {
		
		Integer [] theArray = {5, 9, 20, 22, 20, 
				5, 4, 13, 17, 8, 22, 1, 3,
				7, 11, 9, 10};
		
		
		sorter.sort(theArray, comp1);
		for(int i=0; i<theArray.length; i++) {
		System.out.println(theArray[i]);
		}
		
		sorter.sort(theArray, comp2);
		for(int i=0; i<theArray.length; i++) {
			System.out.println(theArray[i]);
			}
		
	}
	
}
