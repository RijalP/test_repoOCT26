package org.pom;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {
   
	//Initialize the objects in the page using constructor
	public GoogleHomePageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="q")
	public WebElement txtSearch;
	
	@FindBy(name ="btnG")
	public WebElement btnSearch;
	
	@FindBy(linkText = "Introduction — Selenium Documentation")
	 public WebElement  seleniumLink;
	
	public void searchGoogle(String SearchInput) throws InterruptedException{
		//Search for the text for SearchInput variable
				txtSearch.sendKeys(SearchInput);
				
				//Add code for waiting
				
				// Hit the search button
				btnSearch.click();
				
				Thread.sleep(5000);
				
				//Open selenium page link
				seleniumLink.click();
	}
	
	
}
