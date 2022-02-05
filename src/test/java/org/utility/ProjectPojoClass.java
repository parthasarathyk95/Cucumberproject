package org.utility;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPojoClass extends Baseclass{
	public ProjectPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='radio'])[7]")
	private WebElement selectlocation;
	
	@FindBy(xpath="(//i[@class='menu-close ico ico-times'])[2]")
	private WebElement popupclose;
	
	@FindBy(xpath="//i[@class='ico ico-user header2021-nav-icon']")
	private WebElement welcomebtn;
	
	@FindBy(id="labeled-input-signEmail")
//	@FindBy(xpath="//input[@type='email']")
//	@FindBy(xpath="//label[text()='Email Address']")
//	@FindBy(xpath="//label[@for='labeled-input-signEmail']")
//	@FindBy(xpath="(//div[@class='form-cell'])[1]")
	private WebElement txtuser;

//	@FindBy(id="signInSubmit")	
	@FindBy(name="signIn")	
//	@FindBy(xpath="//buttont[@id='signInSubmit']")
	private WebElement usersigninbtn;
	

	@FindBy(id="labeled-input-password")
//	@FindBy(xpath="//input[@id='labeled-input-password']")
//	@FindBy(xpath="//label[text()='Password']")
//	@FindBy(xpath="//label[@for='labeled-input-password']")
//	@FindBy(xpath="(//div[@class='form-cell'])[2]")
	private WebElement txtpass;
	
	@FindBy(id="signInSubmit")
//	@FindBy(xpath="//button[@id='signInSubmit']")
	private WebElement passsigninbtn;
	

	public WebElement getSelectlocation() {
		return selectlocation;
	}
	
	public WebElement getPopupclose() {
		return popupclose;
	}
	
	public WebElement getWelcomebtn() {
		return welcomebtn;
	}
	
	public WebElement getTxtuser() {
		return txtuser;
	}
	
	public WebElement getUsersigninbtn() {
		return usersigninbtn;
	}
	
	public WebElement getTxtpass() {
		return txtpass;
	}
	
	public WebElement getPasssigninbtn() {
		return passsigninbtn;
	}

	
	
}
