package multiplewindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindows {

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "H:\\Java programs- Hands on\\chromedriver.exe");
		
		ChromeDriver driver1=new ChromeDriver(); 
		
		driver1.get("http://www.seleniumframework.com/Practiceform");
		

		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver1.findElement(By.xpath("//*[@id=\"button1\"]")).click();
		//WebDriverWait wait=new WebDriverWait(driver1,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/h2/span/strong")));
		
		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String str=driver1.getTitle();
		String str1="Agile";
		
		
		//System.out.println(str);
		
		if (str1==str) {
			System.out.println("Searched URL that is matching to the expected string is " + str);
		}else {
			System.out.println("Searched URL doesn't match to expected string. Expected String is : " +str1 +" Actual URL is " +str );
		}
		
		driver1.close();
		

	}

}
