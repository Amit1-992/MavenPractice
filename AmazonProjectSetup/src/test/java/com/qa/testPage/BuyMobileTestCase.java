package com.qa.testPage;

import org.testng.annotations.Test;

import com.qa.testLayer.TestBase;

public class BuyMobileTestCase extends TestBase {
	
	@Test
	public void verifyBuyMobile() throws InterruptedException
    {
		Thread.sleep(2000);
	  home.clickOnsearchBox();
	  home.clikOnApple();
	  mobile.clickOnAddCard();
    }
}
