package com.amazonTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Steps {	
	public static WebDriver driver;
	
	static String actualPrice="$47.49";
	
	public static void main (String[] args) {
		System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		pages page = new pages();
		
		page.textBox.sendKeys("qa testing for beginners");
		
		page.searchBtn.click();
		
		page.firstBook.click();
		
		Assert.assertEquals(actualPrice,  page.price.getText());
		
		page.addCart.click();
		
		Assert.assertEquals(actualPrice,  page.priceBeforeCheckout.getText());
		
		page.checkOut.click();
		
		driver.quit();
		
	}
}


