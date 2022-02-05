package org.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.utility.Baseclass;
import org.utility.ProjectPojoClass;

import io.cucumber.java.en.*;

public class ProjectPageStepDefinitionClass extends Baseclass{
	@Given("user need to be in project login page")
	public void user_need_to_be_in_project_login_page() {
		chromeBrowser();
		launchUrl("https://www.newegg.ca/");
		mainwindow();
	}

	@When("user should enter the invalid username and click button for password page")
	public void user_should_enter_the_invalid_username_and_click_button_for_password_page() throws IOException {
		
		ProjectPojoClass p = new ProjectPojoClass();
		
		//btnclick(p.getSelectlocation());
		// Project  clicking  the popup message dialog box to close
		btnclick(p.getPopupclose());
		System.out.println("getPopupclose");
		// Project  clicking  the welcome btn to sigin page
		btnclick(p.getWelcomebtn());
		System.out.println("getWelcomebtn");
		// username enter in the editbox
		//fillTextbox(p.getTxtuser(), "username@gmail.com");
		fillTextbox(p.getTxtuser(), readExcel(0, 1));
		System.out.println("username enter in the editbox");
		// clicking  the sigin btn to next page
		btnclick(p.getUsersigninbtn());
		System.out.println("Username sigin btn to next page");
	}

	@When("user should enter the invalid password")
	public void user_should_enter_the_invalid_password() throws IOException {
		
		ProjectPojoClass p = new ProjectPojoClass();
		
		// password enter in the editbox
		//fillTextbox(p.getTxtpass(), "passwrd1234567");
		fillTextbox(p.getTxtpass(), readExcel(1, 1));
		System.out.println("password enter in the editbox");
	}


	@When("user clicks to login the project page")
	public void user_clicks_to_login_the_project_page() {
		ProjectPojoClass p = new ProjectPojoClass();
		// clicking  the sigin btn to Login page
		btnclick(p.getPasssigninbtn());
		System.out.println("password sigin btn to next page");
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() {
		String currenturl= driver.getCurrentUrl();
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("identity"));
		System.out.println("invalid username and invalid password");
	}
}
