//program for 15 and 9
package CombineArrayHashSet;
import java.util.*; 

public class CombineArrayHashSet {
	
	

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("1","2","3","4","5");
		List<String> list2 = Arrays.asList("3","3","6","5"); 
		
		Set<String> combo = new HashSet<String>(list1);
		combo.addAll(list2);
		
		Set<String> distint_intersect = new HashSet<String>(list1);
		distint_intersect.retainAll(list2);
		
		combo.removeAll(distint_intersect);
		
		for(String n : combo) {
			System.out.println("Distinct strings in the combined array are " + n);
		}

	}

}
