package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11Sep {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();
		// List<WebElement> allText = driver.findElements(By.tagName("h1"));
		// List<WebElement> allText = driver.findElements(By.tagName("h2"));
		  List<WebElement> headings = driver.findElements(By.xpath("//h1|//h2"));

		 
	/*	 System.out.println(allText.size());
		 
			 for(WebElement ele:allText) {
		
		   System.out.println(ele.getText());
			}
*/
		 System.out.println(headings);
		 
		 for(WebElement ele:headings) {
	
	   System.out.println(ele.getText());
		}
		 
	}

}
