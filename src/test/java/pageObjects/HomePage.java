package pageObjects;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (xpath="//button[@data-testid='categoryButton']")
	WebElement btn_allcategory;
	
	@FindBy (xpath="//div[@class='absolute top-14 w-full']//li")
	List<WebElement> btn_dropdown;
	
	@FindBy (xpath="//input[@id='auto-suggestion-search']")
	WebElement txt_search;
	
	@FindBy (xpath="(//div[@id='categories-container']//li)[1]")
	WebElement pdt_asset; 
	
	@FindBy (xpath="//span[text()='Categories']")
	WebElement btn_categories;
	
	@FindBy (xpath="//span[text()='Body']")
	WebElement btn_Body;
	
	@FindBy (xpath="//div[@data-testid='348']")
	WebElement btn_assetitem;
	
	@FindBy (xpath="//span[text()='Connect']")
	WebElement btn_connect;
	
	@FindBy (xpath="//span[text()='Google']")
	WebElement btn_googlesignin;
	
	@FindBy (xpath="//input[@type='email']")
	WebElement txt_email;
	
	@FindBy (xpath="//span[text()='Next']")
	WebElement btn_next;
	
	@FindBy (xpath="//input[@type='password']")
	WebElement btn_password;
	
	public void selectCategory() {
		btn_allcategory.click();
		for(int i=0;i<btn_dropdown.size();i++) {
			String categoryname=btn_dropdown.get(i).getText();
			if(categoryname.equals("Outdoor Assets")) {
				btn_dropdown.get(i).click();
			}
		}
	}
	
	public void enterSearch() throws InterruptedException {
		txt_search.sendKeys("Grass");
		Thread.sleep(5000);
		pdt_asset.click();	
	}
	
	public void openAsset() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(btn_categories).perform();
		btn_Body.click();
		Thread.sleep(5000);
		btn_assetitem.click();
		Thread.sleep(5000);
	}
	
	public void profilePage() throws InterruptedException {
		btn_connect.click();
		Thread.sleep(5000);
		Set<String> window=driver.getWindowHandles();
		//to get IDs from set using Iterator
		Iterator<String> id=window.iterator();
		String parent=id.next();
		String child=id.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		Thread.sleep(5000);
		btn_googlesignin.click();
		Set<String> windows=driver.getWindowHandles();
		//to get IDs from set using Iterator
		Iterator<String> ids=windows.iterator();
		String parent1=ids.next();
		String child1=ids.next();
		String child2=ids.next();
		System.out.println(parent1);
		System.out.println(child1);
		System.out.println(child2);
		driver.switchTo().window(child2);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		txt_email.sendKeys("vamshimanchikatla9615@gmail.com");
		btn_next.click();
		btn_password.sendKeys("Nani@1507");
	}
}
