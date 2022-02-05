package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectClassPojo extends Baseclass{

public  ProjectClassPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//div[@id='gc-custom-header-nav-bar-acct-menu']")

private WebElement signbtn;

@FindBy(xpath="//a[text()='Sign in']")

private WebElement clicksignbtn;

@FindBy(id="loginFormEmailInput")

private WebElement txtemail;

@FindBy(id="loginFormPasswordInput")

private WebElement txtpass;

@FindBy(id="loginFormSubmitButton")

private WebElement loginbtn;

public WebElement getSignbtn() {
	return signbtn;
}

public WebElement getClicksignbtn() {
	return clicksignbtn;
}

public WebElement getTxtemail() {
	return txtemail;
}

public WebElement getTxtpass() {
	return txtpass;
}

public WebElement getLoginbtn() {
	return loginbtn;
}

}