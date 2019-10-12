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
 //Arrays.sort(c);
		System.out.print(Arrays.toString(c));
		
		
		
		for(int i=0;i<c.length;i++) {
			boolean dis_flag = true;
			
			for(int j=0;j<i;j++)
			   {
				if(c[i] ==c[j]) 	{
					dis_flag=false;
					break;
				}
				}
				 if(dis_flag) {
					System.out.println("Distinct values in the array are " + c[i]);		
				 }	
			}
		}
	
	}
