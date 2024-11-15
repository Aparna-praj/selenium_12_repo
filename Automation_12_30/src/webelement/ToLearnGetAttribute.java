package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		WebElement searchTF = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		String value = searchTF.getAttribute("title");
//<input title="Search for Products, Brands and More"> == go fot getAttribute()
	//	<button>login</button> == go for getText()
		System.out.println(value);
		driver.quit();

	}

}
