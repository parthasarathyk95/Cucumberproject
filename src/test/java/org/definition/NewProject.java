package org.definition;

import java.io.IOException;

import org.junit.Assert;
import org.utility.Baseclass;
import org.utility.NewProjectPojoClass;

import io.cucumber.java.en.*;

public class NewProject extends Baseclass{
	@Given("user need to be in project login page")
	public void user_need_to_be_in_project_login_page() {
		chromeBrowser();
		launchUrl("https://uptasker.co.za/");
		mainwindow();
	}

	@When("user should enter the invalid username and click button for password page")
	public void user_should_enter_the_invalid_username_and_click_button_for_password_page() throws IOException {
		NewProjectPojoClass n = new NewProjectPojoClass();
		
		btnclick(n.getLoginbtn());
		
		fillTextbox(n.getTxtuser(), readExcel(0, 1));
	}

	@When("user should enter the invalid password")
	public void user_should_enter_the_invalid_password() throws IOException {
		NewProjectPojoClass n = new NewProjectPojoClass();
		
		fillTextbox(n.getTxtpass(), readExcel(1, 1));
	}

	@When("user clicks to login the project page")
	public void user_clicks_to_login_the_project_page() {
		NewProjectPojoClass n = new NewProjectPojoClass();
		
		btnclick(n.getSubmit());
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() {
		String currenturl= driver.getCurrentUrl();
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("login"));
		System.out.println("invalid username and invalid password");
	}

}
