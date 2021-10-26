package testing;

import org.testng.annotations.Test;

import base.TestBase;

public class ActualTest extends TestBase {
	
	@Test
	public void dolog() {
		driver.get("https://www.makemytrip.com");
	}

}
