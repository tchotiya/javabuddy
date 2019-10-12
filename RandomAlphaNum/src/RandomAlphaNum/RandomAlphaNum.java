package RandomAlphaNum;

import java.util.Scanner;
import java.util.*;
import java.security.*;

public class RandomAlphaNum {

	private static Scanner inputvariable = new Scanner( System.in );

	public static void main(String[] args) {
		
		int t;
		
		System.out.println("Please input the number");
		int a = inputvariable.nextInt();
		
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str=str1.toUpperCase();
		String strr= str1 +str;
				
		String num="0123456789";
		
		String Alpha_Num= strr + num + str1;
		char[] ch = new char[Alpha_Num.length()]; 		

		for(t=a;t < a; t++) {
			
			Random r=new Random();
	        int k=r.nextInt(ch.length);
	        System.out.println(ch[k]);	

		}
	}

}

