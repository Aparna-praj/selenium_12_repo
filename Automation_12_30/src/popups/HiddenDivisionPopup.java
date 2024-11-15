package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();   //to close overlay
		
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
	 String month = "june";
	 int year = 2025;
	 int date = 10;
	 
	 while(true) {
		 try {
			 driver.findElement(By.xpath("//div[text()='"+month+""+year+"']/../..//p[text()='"+date+"']")).click();
			 break;
		 }
		 catch(Exception e) {
			 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			 
		 }
	 }
	}

}
