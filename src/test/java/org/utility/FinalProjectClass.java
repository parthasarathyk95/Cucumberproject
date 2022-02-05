package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalProjectClass extends Baseclass{
	public FinalProjectClass() {
	PageFactory.initElements(driver, this);	
	} 
	@FindBy(xpath="//span[@id='consent-close']")
	private WebElement close;
	
	public WebElement getClose() {
		return close;
	}
	@FindBy(xpath="//span[@id='checkSoftLogout']")
	private WebElement welcome;

	public WebElement getWelcome() {
		return welcome;
	}
	//@FindBy(xpath="//a[@class='signin-link btn-small btn-primary btn-full-width']")
	//@FindBy(xpath="//a[text()='Sign In']")
	@FindBy(xpath="(//input[@type='hidden'])[1]")
	private WebElement signbtn;


	
	public WebElement getSignbtn() {
		return signbtn;
	}
	@FindBy(xpath="//input[@id='login-form-email']")
	private WebElement txtuser;
	
	@FindBy(xpath="//input[@id='login-form-password']")
	private WebElement txtpass;	

	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement submitbtn;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}	
	
}
