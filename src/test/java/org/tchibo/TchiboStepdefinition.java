package org.tchibo;

import java.io.IOException;

import org.junit.Assert;
import org.utility.Baseclass;
import org.utility.TchiboPojoClass;

import io.cucumber.java.en.*;


public class TchiboStepdefinition extends Baseclass{
	@Given("user need to be in project login page")
	public void user_need_to_be_in_project_login_page() throws InterruptedException {
		chromeBrowser();
		launchUrl("https://www.costco.ca/");
		mainwindow();
		TchiboPojoClass n = new TchiboPojoClass();
		
		btnclick(n.getWelcome());
		btnclick(n.getClose());
		btnclick(n.getLoginbtn());
		Thread.sleep(2000);
	}

	@When("user should enter the invalid username")
	public void user_should_enter_the_invalid_username() throws IOException {
		TchiboPojoClass n = new TchiboPojoClass();
		
		btnclick(n.getWelcome());
		btnclick(n.getClose());
		btnclick(n.getLoginbtn());
		fillTextbox(n.getTxtuser(), readExcel(2, 1));
	}

	@When("user should enter the invalid password")
	public void user_should_enter_the_invalid_password() throws IOException {
		TchiboPojoClass n = new TchiboPojoClass();
		
		fillTextbox(n.getTxtpass(), readExcel(3, 1));
	}

	@When("user clicks to login the project page")
	public void user_clicks_to_login_the_project_page() throws InterruptedException {
		TchiboPojoClass n = new TchiboPojoClass();
		
		btnclick(n.getSubmit());
		Thread.sleep(1000);
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() {
		String currenturl= driver.getCurrentUrl();
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("signin"));
		System.out.println("invalid username and invalid password");
	}
	@When("user should enter the {string} valid username")
	public void user_should_enter_the_valid_username(String user) {
		TchiboPojoClass n = new TchiboPojoClass();
		
		fillTextbox(n.getTxtuser(), user);
	}

	@When("user should enter the  {string} invalid password")
	public void user_should_enter_the_invalid_password(String pass) {
		TchiboPojoClass n = new TchiboPojoClass();
		
		fillTextbox(n.getTxtpass(), pass);
	}

	@When("user should enter the invalid Username")
	public void user_should_enter_the_invalid_Username(io.cucumber.datatable.DataTable d) {
		TchiboPojoClass n = new TchiboPojoClass();

		fillTextbox(n.getTxtuser(), d.asList().get(0));
	}

	@When("user should enter the invalid Password")
	public void user_should_enter_the_invalid_Password(io.cucumber.datatable.DataTable d) {
		TchiboPojoClass n = new TchiboPojoClass();
		fillTextbox(n.getTxtpass(), d.asLists().get(1).get(2));
	}
	@Then("user will navigate to valid credential page")
	public void user_will_navigate_to_valid_credential_page() {
		String currenturl= driver.getCurrentUrl();
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("signin"));
		System.out.println("valid username and invalid password");
	}
}
