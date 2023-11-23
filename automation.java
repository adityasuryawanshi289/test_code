import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.FlagTerm;
import java.util.Properties;

public class BookMyShowAutomation {

    public static void main(String[] args) throws MessagingException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Java and Seleniuam\\BookmyShow.com\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//span[text()='Bengaluru']"));
		search.click();
		
		WebElement sign_in = driver.findElement(By.xpath("//div[text()='Sign in']"));
		sign_in.click();
		
		WebElement continueWithMailButton = driver.findElement(By.xpath("//*[text()='Continue with Email']"));
		continueWithMailButton.click();
		
		WebElement email = driver.findElement(By.xpath("//*[@id='emailId']"));
		email.sendKeys("testusersel@yopmail.com");
		
		WebElement continueButton = driver.findElement(By.xpath("//button[text()='Continue']"));
		continueButton.click();
	}
}