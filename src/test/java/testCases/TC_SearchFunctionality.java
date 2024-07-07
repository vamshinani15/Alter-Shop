package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC_SearchFunctionality extends BaseClass{
	@Test
	public void searchFunctionality() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.selectCategory();
		logger.info("***********Selected the Category**********");
		hp.enterSearch();
		logger.info("***********Searched Asset**********");
	}

}
