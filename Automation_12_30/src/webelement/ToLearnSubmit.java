package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSubmit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("//input[@value='Search store']")).click();
		//instead of click(), we can use submit()
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Search store']")).submit();
		Thread.sleep(2000);
		driver.quit();

	}

}
