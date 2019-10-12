package DynamicArraySort;
import java.util.*;

public class DynamicArray {

	public static void main(String[] args) {
		ArrayList<Integer> intlist = new ArrayList<Integer>(); 
		intlist.add(0, 4);
		intlist.add(1, 9);
		intlist.add(2, 2);
		intlist.add(3, 3);
		intlist.add(4, 9);
		intlist.add(5, 6);
		intlist.add(6, 3);
		System.out.println("Original list is "+ intlist);
		intlist.remove(5);
		System.out.println("List after removing one number is " + intlist);
		intlist.sort(null);
		System.out.println("Sorted list is " + intlist);

	}

}
