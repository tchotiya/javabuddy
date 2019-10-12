//program 16 ,17  ,18
package CalculatorExtend;

public class CircleArea extends CalculatorExtend {
   public static void cal(int b) {
		  
	   int area_circle=(int) (3.14*b*b);
		System.out.println("Area of the circle is " + area_circle);
		
	   CalculatorExtend r=new CalculatorExtend();
	   r.areacal(b);
		
	}
   
   public static String getStringC(String a) {
	   CalculatorExtend r1=new CalculatorExtend();
	   return r1.getString(a);
	   
	}
	
	public static void main(String[] args) {
		cal(4);
		System.out.println(getStringC("Lala"));

	}

}
