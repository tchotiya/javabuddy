// this program includes hand on for 32 and 26

package gmailSignUp;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSignUp {

	public static void main(String[] args) {
		
		Scanner scanner_user,scanner_phone;
	System.setProperty("webdriver.chrome.driver", "H:\\Java programs- Hands on\\chromedriver.exe");
	
	ChromeDriver driver1=new ChromeDriver(); 
	
	driver1.get("https://accounts.google.com/signup");
	
	WebElement firstName=driver1.findElement(By.name("firstName"));
	firstName.sendKeys("Govind");;
	
	WebElement lastName=driver1.findElement(By.name("lastName"));
	lastName.sendKeys("Sharma");; 
	
	WebElement Username=driver1.findElement(By.name("Username"));
	Username.sendKeys("Sharma.govindtc1901");; //password
	
	driver1.findElement(By.name("Passwd")).sendKeys("Sulaxana@19");	
	driver1.findElement(By.name("ConfirmPasswd")).sendKeys("Sulaxana@19");    
	driver1.findElement(By.className("CwaK9")).click();
	//time.sleep(5);
	
	WebDriverWait wait=new WebDriverWait(driver1,30);
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/input")));

	scanner_phone=new Scanner(System.in);
	System.out.println("Enter your mobile number : ");
    String user1 = scanner_phone.nextLine();
    
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/input")).sendKeys(user1);

	driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div[1]/div/span/span")).click();
	
	scanner_user = new Scanner(System.in);
	System.out.println("Enter gmail code that you must have received on your phone : ");
    String user = scanner_user.nextLine();
	
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[3]/div/div/div[1]/div/div[1]/input")).sendKeys(user);
	
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[4]/div[1]/div[1]/span/span")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[5]/div[1]/div/span/span")));
	
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[3]/div[1]/div/div/div[1]/div/div[1]/input")).sendKeys("03");
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[3]/div[2]/div/div/div[2]/select")).sendKeys("October");
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[3]/div[3]/div/div/div[1]/div/div[1]/input")).sendKeys("1993");
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[4]/div[1]/div/div[2]/select")).sendKeys("Female");
	
	
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[5]/div[1]/div/span/span")).click();
		driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div[1]/div[2]/button")).click();
		driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div/div/div[1]/span/div/div[3]/div[1]/div/div/label/div")).click();
		driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div/div/div[1]/span/div/div[3]/div[2]/div/div/label/div")).click();
		
		driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div/div/div[2]/div/div[1]/div/span/span")).click();
		
	
	}

}
