package GoogleSearch32;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "H:\\Java programs- Hands on\\chromedriver.exe");
       ChromeDriver driver1=new ChromeDriver(); 
       
       driver1.get("http://google.com/");
       
       WebElement search= driver1.findElement(By.name("q"));
		search.sendKeys("github");
		search.submit();
		
		driver1.findElement(By.className("LC20lb")).click();
		
		String str= driver1.getCurrentUrl();
		//System.out.println(output.getText());
		String str1="https://github.com/"; //https://timesofindia.indiatimes.com/
		
		if (str1==str) {
			System.out.println("Searched URL that is matching to the expected string is " + str);
		}else {
			System.out.println("Searched URL doesn't match to expected string. Expected String is : " +str1 +" Actual URL is " +str );
		}
		
		//System.out.println(str);
		//System.out.println(str1);
		
         driver1.close();
	

	}

}
