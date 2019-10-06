package JavaHandsOnpkg;
import java.util.*;

public class VowelCon {
	
	
	private static Scanner variable = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		System.out.println("Please enter any alphabet");
		
		String[] arr = { "a", "e", "i","o","u" };
	    Set<String> names = new HashSet<String>(Arrays.asList(arr));
	
		String console_variable=variable.nextLine().toUpperCase();;
		
		switch(console_variable) {
		case "A":
			System.out.println("Vowel");
		break;
		case "E": 
			System.out.println("Vowel");
		break;
		case "I": 
			System.out.println("Vowel");
		break;
		case "O": 
			System.out.println("Vowel");
		break;
		case "U": 
			System.out.println("Vowel");
		break;
		default:
			System.out.println("Consonanat");
		
		}
		
	}
	

}