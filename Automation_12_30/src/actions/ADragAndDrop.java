package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ADragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame);
		
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(image1, trash).perform();
		act.dragAndDrop(image2, trash).perform();
		
		driver.switchTo().defaultContent();
		act.pause(2000).perform();
	 driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[text()='CheatSheets']")).click();
	 driver.findElement(By.linkText("SQL Cheat Sheet")).click();
	 
	 driver.switchTo().frame("aswift_5");
	 driver.findElement(By.xpath("//iframe[@title='Advertisement']"));
	 act.pause(2000).perform();
	// driver.findElement(By.id("aswift_5"));
     driver.quit();
	// driver.findElement(By.xpath("//svg[@fill='#5F6368']")).click();
	
	}

}
