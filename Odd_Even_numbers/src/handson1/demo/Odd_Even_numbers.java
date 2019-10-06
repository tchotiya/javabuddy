
package handson1.demo;
import java.util.Scanner;

public class Odd_Even_numbers {

	private static Scanner inputvariable = new Scanner( System.in );

	public static void main(String[] args) {
		
		int t;
		
		System.out.println("Please input the number");
		int a = inputvariable.nextInt();
		t=a%2;
		
		if(t == 0) {
		
		System.out.println("Entered integer is an even number");		
	
	}else {
		System.out.println("Entered integer is odd number3");
	} 
	}
};
