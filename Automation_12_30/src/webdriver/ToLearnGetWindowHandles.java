package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		/*driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		Thread.sleep(5000);
		driver.findElement(By.id("browserButton3")).click();
	    Set<String> allWindowIds = driver.getWindowHandles();
	    System.out.println(allWindowIds);
	    for(String id:allWindowIds) {
	    	System.out.println(id);
	    }*/
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allWindowsIds = driver.getWindowHandles();
		for(String id:allWindowsIds)
		{
			System.out.println(id);
		}
	    
	}

}
