//program 19
package CircleAreaCalulator;

public class CircleAreaCalulator {
	
	public static void areacal(int a) {
		
		int area_circle=(int) (3.14*a*a);
		int area_square=(int) (a*a);
		System.out.println("Area of the circle is " + area_circle);
		System.out.println("Area of the square is " + area_square);
		
	}
	
	public static void main(String[] args) {
		areacal(4);
	}
	}


