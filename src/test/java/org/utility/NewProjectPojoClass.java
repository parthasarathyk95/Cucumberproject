package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProjectPojoClass extends Baseclass{

	public NewProjectPojoClass() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Log in'])[2]")
	private WebElement loginbtn;

	@FindBy(id="loginform-email")
	private WebElement txtuser;
	
	@FindBy(id="loginform-password")
	private WebElement txtpass;
	
	@FindBy(name = "login-button")
	private WebElement submit;

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}
