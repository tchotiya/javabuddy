package ReverseArrayPrint;


public class ReverseArrayPrint {
	

	public static void main(String[] args) {
		String str1="My First Learning program";
		String str=str1.toUpperCase();
		String a[]=str.split(" ");
		//int i = str.length();
		//System.out.println( i);
		
		//char ch = str.charAt(i) ;
		//System.out.println( ch);
		char[] ch = str.toCharArray(); 

 
		for (int i = ch.length-1; i>=0;i--) {

			System.out.println(ch[i]);
		
			}
		}
	}
