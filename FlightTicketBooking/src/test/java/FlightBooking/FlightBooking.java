package FlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class FlightBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\Java programs- Hands on\\chromedriver.exe");
		
		ChromeDriver driver1=new ChromeDriver(); 
		
		driver1.get("http://newtours.demoaut.com/");
		
		driver1.manage().window().maximize();
		
		WebElement UserName = driver1.findElement(By.name("userName"));
		UserName.sendKeys("tutorial");
		
		WebElement password = driver1.findElement(By.name("password"));
	    password.sendKeys("tutorial");
		driver1.findElement(By.name("login")).click();
		
		WebElement NoOfPassesenger = driver1.findElement(By.name("passCount"));		
		Select NoOfPass = new Select(NoOfPassesenger);		
		NoOfPass.selectByValue("3");
		
		WebElement DepartCity = driver1.findElement(By.name("fromPort"));		
		Select DepartureFrom = new Select(DepartCity);		
		DepartureFrom.selectByValue("Paris");
		
		WebElement FromMonth = driver1.findElement(By.name("fromMonth"));		
		Select Month = new Select(FromMonth);		
		Month.selectByValue("10");
		
		WebElement FromDay = driver1.findElement(By.name("fromDay"));		
		Select Day = new Select(FromDay);		
		Day.selectByValue("15");
		
		WebElement ArriveCity = driver1.findElement(By.name("toPort"));		
		Select ArrCity = new Select(ArriveCity);		
		ArrCity.selectByValue("Zurich");
		
		//WebElement toMonth = driver1.findElement(By.name("toMonth"));		
		//Select ToMonth = new Select(toMonth);		
		//ToMonth.selectByValue("November");
		
		//WebElement toDay = driver1.findElement(By.name("toDay"));		
		//Select ToDay = new Select(toDay);		
		//ToDay.selectByValue("24");
			
		driver1.findElement(By.name("findFlights")).click(); 
		
		driver1.findElement(By.name("reserveFlights")).click();  
		
		driver1.findElement(By.name("passFirst0")).sendKeys("Trupti");   
		driver1.findElement(By.name("passLast0")).sendKeys("Chotiya"); 
		driver1.findElement(By.name("creditnumber")).sendKeys("1234567889987654");  
		driver1.findElement(By.name("cc_frst_name")).sendKeys("Trupti");   
		driver1.findElement(By.name("cc_last_name")).sendKeys("Chotiya"); 
		
		driver1.findElement(By.name("buyFlights")).click();   
		
		 //WebElement output=driver1.findElement(By.name("frame_header_info"));
		 
		 WebElement output1=driver1.findElement(By.className("frame_header_info"));
		 
		//console.log(text);
		
		//Console.log(null, null, text, null);
		 
		String text= output1.getText();
		 
		 System.out.println(text);
		
		driver1.close();
		
		
		


	}

}
