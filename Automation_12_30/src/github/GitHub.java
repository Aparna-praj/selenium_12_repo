package github;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GitHub {
	@Test
	public void addMessage() {
		Reporter.log("welcome to Github", true);
	}
}