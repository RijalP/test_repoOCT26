package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageObject {
	
	public SeleniumPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	
	
	
	@FindBy (xpath ="html/body/div/div[1]/ul/li[4]/a")
	public WebElement downloadLink;
	
	@FindBy (xpath = "html/body/div/div[2]/div[2]/ul[2]/li[1]/a")
	public WebElement safariDriverLink;
	
	public void downloadDriver()
	{
		downloadLink.click();
		
		safariDriverLink.click();
	}
	
	
	
	
}
