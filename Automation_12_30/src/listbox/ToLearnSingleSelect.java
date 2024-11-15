package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		 WebElement monthDropdown = driver.findElement(By.id("month"));
		 
		 Select monthSelect=new Select(monthDropdown);
		// monthSelect.selectByIndex(11);
		// monthSelect.selectByValue("3");
		 monthSelect.selectByVisibleText("Jan");
		 
		 WebElement yearDropdown = driver.findElement(By.id("year"));
		 
		 Select yearSelect=new Select(yearDropdown);
		// yearSelect.selectByIndex(5);
		 //yearSelect.selectByValue("2011");
		 yearSelect.selectByVisibleText("2012");
		 
		 System.out.println(monthSelect.isMultiple());

	}

}
