package org.finalstepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.utility.Baseclass;
import org.utility.FinalProjectClass;

import io.cucumber.java.en.*;

public class FinalStepDefinition extends Baseclass {
	@Given("user need to be in project login page")
	public void user_need_to_be_in_project_login_page() {
		chromeBrowser();
		launchUrl("https://www.thebay.com/");
		mainwindow();
		/////////////////

	}

	@When("user should enter the invalid username and click button for password page")
	public void user_should_enter_the_invalid_username_and_click_button_for_password_page() throws IOException {
		FinalProjectClass f = new FinalProjectClass();
		// initial popup close 
		btnclick(f.getClose());
		// to do mouse over action by Action Class
		Actions a = new Actions(driver);
		// move to Elements
		a.moveToElement(f.getWelcome()).perform();
		// clicking the sigin btn goes to sign in page 
		btnclick(f.getSignbtn());
		
		//FinalProjectClass f = new FinalProjectClass();
		// enter username in editbox
		fillTextbox(f.getTxtuser(), readExcel(0, 1));
		
		 
	}

	@When("user should enter the invalid password")
	public void user_should_enter_the_invalid_password() throws IOException {
//		FinalProjectClass f = new FinalProjectClass();
//		// enter password in editbox
//		fillTextbox(f.getTxtpass(), readExcel(1, 1));
	}

	@When("user clicks to login the project page")
	public void user_clicks_to_login_the_project_page() {
//		FinalProjectClass f = new FinalProjectClass();
//		btnclick(f.getSubmitbtn());
		
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() {
//		String currenturl= driver.getCurrentUrl();
//		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("login"));
//		System.out.println("invalid username and invalid password");
	}

}
