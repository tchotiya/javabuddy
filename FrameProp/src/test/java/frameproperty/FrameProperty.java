package frameproperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class FrameProperty {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Java programs- Hands on\\chromedriver.exe");
	       ChromeDriver driver1=new ChromeDriver(); 
	       
	       Properties prop=new Properties();
	       
	       FileInputStream file=new FileInputStream("C:\\Users\\Tchu\\eclipse-workspace\\FrameProp\\src\\test\\java\\frameproperty\\URL.properties");
	             
	       prop.load(file);
	       
	       String uu=prop.getProperty("URL");
	       //System.out.println(uu);
	            
	       driver1.get(uu);
	       WebDriverWait wait=new WebDriverWait(driver1,30);
	   	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/input")));

	   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/section/div[2]/div/div[3]/div/div/div[1]/div/div/div/article/form/input")));
		
	   	driver1.switchTo().frame("a077aa5e");
		driver1.findElement(By.id("a077aa5e")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/a/img")));
		driver1.switchTo().parentFrame();

	}

}
