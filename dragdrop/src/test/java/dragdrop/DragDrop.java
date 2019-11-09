package dragdrop;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "H:\\Java programs- Hands on\\chromedriver.exe");
		
		ChromeDriver driver1=new ChromeDriver(); 
		
		driver1.get("http://www.seleniumframework.com/Practiceform");
		

		//driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver1,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/button[1]")));
		
		
		WebElement sourcebutton=driver1.findElement(By.xpath(".//*[@id='draga']"));
		WebElement targetbutton=driver1.findElement(By.xpath(".//*[@id='dragb']"));
		
		//sourcebutton.click();		
		Actions action=new Actions(driver1);

		
		action.dragAndDrop(sourcebutton, targetbutton).build().perform();
		
		//System.out.println(sourcebutton);
		driver1.close();
	
	}

}
