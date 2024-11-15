package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("alex4@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://demowebshop.tricentis.com/")) {
			System.out.println("Login success");
		}
		else {
			System.out.println("login fail");
		} 
		
	}
		
	}


