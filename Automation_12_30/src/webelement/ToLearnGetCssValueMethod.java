package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnGetCssValueMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement errorMsg = driver.findElement(By.linkText("Register"));
		String color = errorMsg.getCssValue("Color");
		String fontsize = errorMsg.getCssValue("font-size");
		String fontfamily = errorMsg.getCssValue("font-family");	
		System.out.println(color);
		System.out.println(fontsize);
		System.out.println(fontfamily);

	} 

}
