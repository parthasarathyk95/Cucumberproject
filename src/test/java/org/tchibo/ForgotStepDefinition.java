package org.tchibo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.utility.Baseclass;
import org.utility.TchiboPojoClass;

import io.cucumber.java.en.*;

public class ForgotStepDefinition extends Baseclass {
	@Given("user should lauch the chrome browser and launch the project url")
	public void user_should_lauch_the_chrome_browser_and_launch_the_project_url() throws InterruptedException {
		chromeBrowser();
		launchUrl("https://www.costco.ca/");
		mainwindow();
		TchiboPojoClass n = new TchiboPojoClass();
		
		btnclick(n.getWelcome());
		btnclick(n.getClose());
		btnclick(n.getLoginbtn());
		Thread.sleep(2000);
	}

	@Given("user should pass the email id under password reset page")
	public void user_should_pass_the_email_id_under_password_reset_page() throws InterruptedException {
		TchiboPojoClass n = new TchiboPojoClass(); 
		
		btnclick(n.getForgotpass());
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[@class='mdc-text-field mdc-text-field--outlined'])[2]")).sendKeys("user@gmail.com");
		n.getForgotemail().sendKeys("user@gmail.com");
	}

	@Given("user should click sebd verification code")
	public void user_should_click_sebd_verification_code() throws InterruptedException {
		TchiboPojoClass n = new TchiboPojoClass(); 
		
	    btnclick(n.getSendverifybtn());
	    
	    Thread.sleep(2000);
	}

	@Then("user should navigate verification code from email  page")
	public void user_should_navigate_verification_code_from_email_page() {
		String currenturl= driver.getCurrentUrl();
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("CombinedSigninAndSignup"));
		System.out.println("user should navigate verification code from email  page");
	}
}
