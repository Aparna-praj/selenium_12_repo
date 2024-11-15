package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MonthDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		
		Select monthSelect=new Select(monthDropdown);
		List<WebElement> allOptions = monthSelect.getOptions();
		System.out.println(allOptions.size());
		
		for(int i=0;i<allOptions.size();i++) {                                    //for(int i=0;i<12;i++)
			Thread.sleep(2000);   
			monthSelect.selectByIndex(i);                                              //monthSelect.selectByIndex(i);
			System.out.println(allOptions.get(i).getText());                      //allOptions.get(i).getText()
			                                                                          //monthSelect.selectByVisibleText(text);
 
		/* for(WebElement ele:allOptions) {
			 monthSelect.selectByVisibleText(ele.getText());
			 if(ele.isSelected()) {
				 System.out.println(ele.getText()+"----->selected");
			 }
		 }*/
		}
		
	}

}
