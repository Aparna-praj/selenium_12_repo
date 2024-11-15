package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Sep {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoapp.skillrary.com/");
		driver.findElement(By.partialLinkText("SIGNUP")).click();
		
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://demoapp.skillrary.com/login.php?type=register")) {
			System.out.println("Register page is displayed");
		}
		else {
			System.out.println("register page is not displayed");
		}
		
		
		driver.findElement(By.name("firstname")).sendKeys("alexa");
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("alex4@gmail.com");
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("123456");
		driver.findElement(By.name("repassword")).sendKeys("123456");
		driver.findElement(By.name("lastname")).sendKeys("sam");
		driver.findElement(By.name("signup")).click();
		
		
		
		driver.navigate().back();
		String urll = driver.getCurrentUrl();
		if(urll.equals("https://demoapp.skillrary.com/")) {
			System.out.println("Welcome page is displayed");
		}
		else {
			System.out.println("welcome page is not displayed");
		}
		

	}

}
