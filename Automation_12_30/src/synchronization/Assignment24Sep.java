package synchronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment24Sep {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@type='button']"));
		 
		
		addToCartButton.click();
		
	
		String msg = driver.findElement(By.xpath("//p[@class='content']")).getText();
		System.out.println(msg);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));//explicit time
		wait.until(ExpectedConditions.invisibilityOf(addToCartButton));//condition

		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.quit();

		

	}

}




