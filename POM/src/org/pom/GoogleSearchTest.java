package org.pom;
import java.io.*;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pom.DDT.ExcelLib;

public class GoogleSearchTest {

	public static WebDriver FFdriver = new FirefoxDriver();
	
	
	
	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		
		FFdriver.navigate().to("http://www.google.com");
		
		// Objects for the page
		GoogleHomePageObjects page = new GoogleHomePageObjects(FFdriver);
		
		// Create ExcelLib object
		ExcelLib dataInput = new ExcelLib();
		
		//String SearchInput = dataInput.importData ("/Users/LajirMac/Documents/SearchWord.xls",0, 2);
		page.searchGoogle(dataInput.importData ("/Users/LajirMac/Documents/SearchWord.xls",0, 1));
		
		
		
		
		Thread.sleep(5000);
		SeleniumPageObject sel_page = new SeleniumPageObject(FFdriver);
		sel_page.downloadDriver();

	}

}
