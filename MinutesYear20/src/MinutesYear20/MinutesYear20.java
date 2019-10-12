package MinutesYear20;
import java.util.*;

import java.text.*; 

public class MinutesYear20 {
	private static Scanner inputvariable = new Scanner( System.in );

	public static void main(String[] args) {
		
		//int t;
		double totalmin=525600;
		
		System.out.println("Please input miutes you desired to convert to years and days");
		int a = inputvariable.nextInt();
		
		long year = (long) (a / totalmin);
	    long t = (long) (a % totalmin);
	    int day =(int) (t % 365);
	    //program 20 output
	    System.out.println("Entered minutes are converted to number of year:" + year +" and number of days as :" +day); 
	    
	    DateFormat df = new SimpleDateFormat("EEEE");
	     Calendar calendaro = Calendar.getInstance();
	     int y=calendaro.get(Calendar.DAY_OF_WEEK);
	     y=y+5;
	     
	   //program 21 output 
	    System.out.println("Current date's day is " + df.format(calendaro.getTime()));   
	    //System.out.println("Current date's day is " + calendaro.get(Calendar.DAY_OF_WEEK)); 
	   
	  //program 22 output 
	    if(y==1||y==7) {
	    	System.out.println("In next 5 days it will be a weekend as days of the week will be "+y);
	    }
	    else {
	    	System.out.println("In next 5 days it will not be a weekend as days of the week will be "+y);
	    }
	    

	}

}
