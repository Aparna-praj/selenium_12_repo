package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImpementation.class)
public class TestScript {
	@Test
	public void login() {
		Reporter.log("Launch the Browser", true);
		Reporter.log("Navigate to url", true);
		Reporter.log("click on login link", true);
		Reporter.log("enter valid credentials", true);
		Reporter.log("click on login button", true);
		Assert.assertEquals(true, true);

	}

}
