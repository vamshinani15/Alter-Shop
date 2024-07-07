package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC_CreatorProfile extends BaseClass{
	@Test
	public void creatorProfile() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.profilePage();
		Thread.sleep(5000);
	}
}
