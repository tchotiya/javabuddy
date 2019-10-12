//program 14
package hashmappro;
import java.util.*; 

public class hashmappro {
	
	public static void main(String[] args) {
		

		
		HashMap<String,Double> hasmap = new HashMap<String,Double>();
		hasmap.put("Colgate",20.9);
		hasmap.put("Paper_Roll",4.5);
		hasmap.put("Bread",8.3);
		hasmap.put("Milk",2.3);
		hasmap.put("Rice",5.0);
		hasmap.put("Lentil",6.4);
		

		Double colgate = hasmap.get("Colgate");
		System.out.println("The price of colgate is: " + colgate);
		
		System.out.println(hasmap); 
		
	}

}
