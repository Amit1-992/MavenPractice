package com.qa.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testLayer.TestBase;

public class HomePage extends TestBase 
{
	
	public void HomePage()
    {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//form[@id='nav-search-bar-form']")
	private WebElement search_box;
	
	public void clickOnsearchBox()
	{
		search_box.sendKeys("iphone13");
		search_box.submit();	
		
	}
	
	@FindBy(xpath="(//span[text()='Apple iPhone 13 (128GB) - Blue'])[1]")
	private WebElement Apple_iphone_13;
	
	public void clikOnApple()
	{
		Apple_iphone_13.click();
	}

	

}
