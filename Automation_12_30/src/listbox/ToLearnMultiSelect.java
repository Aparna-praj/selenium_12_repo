package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
    	WebElement priceListBox= driver.findElement(By.id("cars"));
		
		Select priceSelect=new Select(priceListBox);
		priceSelect.selectByIndex(1);
		priceSelect.selectByValue("90");
		priceSelect.selectByVisibleText("INR 300 - INR 399 ( 1 )"); //avoid space
		
		Thread.sleep(2000);
	//	priceSelect.deselectByValue("99");
		priceSelect.deselectAll();
		
		System.out.println(priceSelect.isMultiple()); 
		
		

	}

}
