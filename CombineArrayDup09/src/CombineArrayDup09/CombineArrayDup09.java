package CombineArrayDup09;

import java.util.Arrays;

public class CombineArrayDup09 {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
		
		int b[]={3,3,6,5};
		
		int c[];
		
		c=new int[a.length + b.length];
		
 for(int i=0;i < a.length;i++) {
	 c[i]=a[i];
	 
 }
 for(int i=0;i < b.length;i++) {
	 c[a.length + i]=b[i];
	 
 }
		
		System.out.print(Arrays.toString(c));
	
	}
}