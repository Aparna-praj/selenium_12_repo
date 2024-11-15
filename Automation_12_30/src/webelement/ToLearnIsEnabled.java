package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("====before passing data====");
		System.out.println("Enable status: "+loginbutton.isEnabled());
		
		System.out.println("====after passing data====");
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("test@12345")	;
		System.out.println("enable status: "+loginbutton.isEnabled());
		
		driver.quit();

		
	}

}
