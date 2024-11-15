package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Alexa");
		driver.findElement(By.id("LastName")).sendKeys("Sam");
		driver.findElement(By.name("Email")).sendKeys("alex4@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.name("Confirm password")).sendKeys("123456");
		driver.findElement(By.name("register-button")).click();

	}

}

