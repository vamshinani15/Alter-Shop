package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC_AssetDetailsPage extends BaseClass{
	@Test
	public void assetDetails() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.openAsset();
		logger.info("***********Opened Asset Details Page**********");
		
	}

}
