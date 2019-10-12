// this program contains handson - 10,11,12
package IntToString;

public class IntToString {
	
	public static String getString1(String a) {
	 return a;			
	}
	
	public static String getString2(String b) {
		 return b;			
		}

	public static void main(String[] args) {
		
		int t=9;
		String S=Integer.toString(t);
		
		System.out.println("Convertion of Int to String is " + S);
	
		String M="7";
		int p=Integer.parseInt(M);
		System.out.println("Convertion of String to Int is " + p);

		char c='M';
		String s1=Character.toString(c);
		System.out.println("Conversion of Char to String is: " +s1);
		
		String T="9";
		//int aa=Integer.parseInt(s, radix)
		
		String ui=getString1(M);
		String ti=getString2(T);
		
		int ai=Integer.parseInt(ui);
		int bi=Integer.parseInt(ti);
		
		int ci=ai+bi;
		
		System.out.println(" Sum of 2 strings passed as arguments is " + ci);		
	 

	}

}
