package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testLayer.TestBase;

public class MobilePage extends TestBase {
	
	
	public MobilePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
    private WebElement Add_to_card;
	
	public void clickOnAddCard()
	{
		Add_to_card.click();
	}
}
