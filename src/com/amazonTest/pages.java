package com.amazonTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pages {
	
		@FindBy(id = "twotabsearchtextbox")
		public WebElement textBox;
		
		@FindBy(id = "nav-search-submit-button")
		public WebElement searchBtn;
		
		@FindBy(xpath = "//div[@id='a-popover-sp-info-popover-1617296279']//following::h2[1]/a/span")
		public WebElement firstBook;
		
		@FindBy(xpath = "//span[@id='newBuyBoxPrice']")
		public WebElement price;
		
		@FindBy(id = "add-to-cart-button")
		public WebElement addCart;
		
		@FindBy(xpath = "//div[@id='hlb-subcart']//following-sibling::span[2]")
		public WebElement priceBeforeCheckout;
		
		@FindBy(id = "hlb-ptc-btn-native")
		public WebElement checkOut;
		
		public pages() {
			PageFactory.initElements(Steps.driver, this);
			
		}
		

	}


