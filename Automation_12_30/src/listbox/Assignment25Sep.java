package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment25Sep {

	public static void main(String[] args)   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		driver.get("https://www.freshersworld.com/");
		WebElement registerLink = driver.findElement(By.xpath("//span[@class='reg-btn']"));
		System.out.println(registerLink.isDisplayed());
		
		driver.findElement(By.xpath("//span[@class='reg-btn']")).click();
		WebElement currentCityDropdown = driver.findElement(By.id("currentCity"));
		Select currentCitySelect=new Select(currentCityDropdown);
		currentCitySelect.selectByVisibleText("Bangalore");
		
		WebElement qualificationDropdown = driver.findElement(By.id("course"));
		Select qualificationSelect=new Select(qualificationDropdown);
		qualificationSelect.selectByVisibleText("BE/B.Tech");
		
	}

}
