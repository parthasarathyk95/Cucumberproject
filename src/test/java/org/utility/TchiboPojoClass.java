package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TchiboPojoClass extends Baseclass {
	

		public TchiboPojoClass() {
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//span[@class='co-close']")
		private WebElement close;

		
		@FindBy(xpath="//input[@id='language-region-set']")
		private WebElement welcome;

		
		@FindBy(xpath="//a[@id='header_sign_in']")
		private WebElement loginbtn;

		@FindBy(id="signInName")
		//@FindBy(xpath="//input[@id='signInName']")
		private WebElement txtuser;
		
		@FindBy(id="password")
		//@FindBy(xpath="//input[@id='password']")
		private WebElement txtpass;
		
		@FindBy(xpath="//button[@id='next']")
		private WebElement submit;

		@FindBy(xpath="//button[text()='Forgot Password?']")
		private WebElement forgotpass;
		
		@FindBy(id="email")
		private WebElement  forgotemail;

		@FindBy(xpath="//button[text()='Send Verification Code']")
		private WebElement sendverifybtn;
		
		
		
		public WebElement getClose() {
			return close;
		}
		
		public WebElement getWelcome() {
			return welcome;
		}
		
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
		
		public WebElement getForgotpass() {
			return forgotpass;
		}
		
		public WebElement getForgotemail() {
			return forgotemail;
		}
		public WebElement getSendverifybtn() {
			return sendverifybtn;
		}
}
