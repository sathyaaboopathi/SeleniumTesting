package org.stepDefinition;

import org.bscl.BaseClass;
import org.pojo.FramePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		launchBrowser();
		windowMaximize();
		
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		FramePojo f=new FramePojo();
		passText("Selenium@gmail.com",f.getEmail());
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		FramePojo f=new FramePojo();
		passText("Imakes", f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		FramePojo f=new FramePojo();
		clickBtn(f.getLogin());
	}

	@When("To check whether navigate to the homepage or not")
	public void to_check_whether_navigate_to_the_homepage_or_not() {
		System.out.println("to check your login credential");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}

}
