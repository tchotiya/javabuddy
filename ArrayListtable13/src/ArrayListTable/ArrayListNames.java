package ArrayListTable;
import java.util.*; 

public class ArrayListNames {
	
	String names;
	int phonenumber;
	String address;

	/*public  String getName(String name) {
		 return name;			
		}
	
	public  void getPhone(int phone) {
		 this.phonenumber= phone;			
		}
	public static String getCity(String city) {
		 return city;			
		}*/
	
	class contactData 
    { 
       
        String name; 
        long phone; 
        String city;

        contactData(String name, long phone,String city) 
        { 
            
            this.name = name; 
            this.phone = phone; 
            this.city=city;
        } 
    } 

	public static void main(String[] args) {
		
        String name[] = {"Trupti","Govind","Revadi"}; 
        long phone[] = {997507899, 997507898, 997507897};
        String city[]= {"NCL","Aurangabad","Pune"};

        ArrayListNames mylist=new ArrayListNames();
 
        mylist.addValues(name, phone,city);
		
	}
	
	public void addValues(String name[], long phone[],String city[]) 
    { 
		
		ArrayList<contactData> list=new ArrayList<>(); 

			for (int i = 0; i < 3; i++) {
				list.add(new contactData(name[i],phone[i],city[i]));

				} 
			Printfunction(list);
    } 
	
	public void Printfunction(ArrayList<contactData> list) 
    { 
       
        for (int i = 0; i < 3; i++) 
        { 
        	
        	contactData data = list.get(i); 
        	boolean nameflag = list.contains("NCL"); 
        	

        	System.out.println(data.name+" "+data.phone+" "+data.city); 
        	System.out.println(nameflag);
        	
        	/*if(nameflag) {
            System.out.println(data.name+" "+data.phone+" "+data.city); 
        } 
        	else {
        		System.out.print("Name doesnt match");
        	} */
        }
    }
}
