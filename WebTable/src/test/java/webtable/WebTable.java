package webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Java programs- Hands on\\chromedriver.exe");
		
		ChromeDriver driver1=new ChromeDriver(); 
		
		driver1.get("http://demo.guru99.com/test/web-table-element.php");
		

		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//driver1.findElement(By.tagName("tr")).getSize();
				
	//Dimension totalrows= driver1.findElement(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr")).getSize();
		
		for (WebElement tableData:driver1.findElements(By.tagName("tr"))) {
			
			System.out.println(tableData.getText());
		}
	}

}
