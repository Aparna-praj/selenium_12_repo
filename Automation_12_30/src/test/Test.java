package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Test {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/webPg.png");
		FileHandler.copy(temp, dest);
		driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		
		
		WebElement company = driver.findElement(By.partialLinkText("Company"));
	//	WebElement company = driver.findElement(By.xpath("//a[contains(text(),'Company')]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(company).perform();
		
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String contact = driver.findElement(By.xpath("(//div[@class='text-reset text-decoration-none'])[2]/..//p[text()='Bengaluru, India']")).getText();
		
		System.out.println(contact);
		
	}

}
