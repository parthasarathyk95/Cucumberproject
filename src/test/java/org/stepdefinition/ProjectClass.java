package org.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.utility.Baseclass;
import org.utility.ProjectClassPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectClass extends Baseclass {
	@Given("user need to be in project login page")
	public void user_need_to_be_in_project_login_page() {
		chromeBrowser();
		launchUrl("https://www.expedia.co.in/Newlands.dx6155021");
		mainwindow();
	}

	@When("user should enter the invalid username and click button for password page")
	public void user_should_enter_the_invalid_username_and_click_button_for_password_page() throws IOException {
		
		ProjectClassPojo p = new ProjectClassPojo();
      //
      btnclick(p.getSignbtn());
      System.out.println("press sign in");
      btnclick(p.getClicksignbtn());
      System.out.println("click sign in btn");
      fillTextbox(p.getTxtemail(), readExcel(0, 1));
      System.out.println("username entered");
	}

	@When("user should enter the invalid password")
	public void user_should_enter_the_invalid_password() throws IOException {
		
		ProjectClassPojo p = new ProjectClassPojo();
		fillTextbox(p.getTxtpass(), readExcel(1, 1));
		System.out.println("password entered");
		btnclick(p.getLoginbtn());
		System.out.println("login btn entered");
	}


	@When("user clicks to login the project page")
	public void user_clicks_to_login_the_project_page() {
		String currenturl= driver.getCurrentUrl();
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("login"));
		System.out.println("invalid username and invalid password");
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() {
		String currenturl= driver.getCurrentUrl();
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("login"));
		System.out.println("invalid username and invalid password");
	}
}
