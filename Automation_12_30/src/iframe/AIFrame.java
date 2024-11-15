package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AIFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement mapFrame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));    //id("map-instance-79297")
		driver.switchTo().frame(mapFrame);
		driver.findElement(By.name("Montana")).click();
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
        driver.findElement(By.partialLinkText("SIGN UP")).click(); //use partial linktext ,so that can write same as SIGN UP as we see
	    driver.findElement(By.xpath("//input[@id='user']")).sendKeys("testing4@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='cpass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Aparna");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7856842135"); 
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		String successMsg = driver.findElement(By.xpath("//b[text()='Thank you for registering!']")).getText();
		System.out.println(successMsg);
	}

}
