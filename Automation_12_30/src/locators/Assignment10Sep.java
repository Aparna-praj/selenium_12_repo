package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10Sep {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("alex4@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		
		
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://demowebshop.tricentis.com/")) {
			System.out.println("Login success");
		}
		else {
			System.out.println("login fail");
		} 

	}

}
