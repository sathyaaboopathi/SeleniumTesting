package org.stepDefinition;

import org.bscl2.BaseClass;
import org.pojo1.SignINPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbRegistration extends BaseClass {
	
	
SignINPojo s;
@Given("To launch the browser and maximise the window")
public void to_launch_the_browser_and_maximise_the_window() {
	launchBrowser();
	    
}

@When("To launch url of fb application")
public void to_launch_url_of_fb_application() {
	launchUrl("https://en-gb.facebook.com/");
    
}

@When("To Click the create new account button")
public void to_Click_the_create_new_account_button() {
	s=new SignINPojo();
	clickBtn(s.getCreateNewAccount());
   
}

@When("To pass firstname in firstname text box")
public void to_pass_firstname_in_firstname_text_box() {
	s=new SignINPojo();
	passText("Sathyaa",s.getFirstNameTxtBox());
				
 
}

@When("To pass secondname in secondname text box")
public void to_pass_secondname_in_secondname_text_box() {
	s=new SignINPojo();
	passText("Boopathi",s.getSecondNameTxtBox());
	
}

@When("To pass mobilenumber or email in email text box")
public void to_pass_mobilenumber_or_email_in_email_text_box() {
	s=new SignINPojo();
	passText("sathyaashri@gmail.com",s.getMobileEmailTxtBox());
   
}

@When("To create new password using new password text box")
public void to_create_new_password_using_new_password_text_box() {
    passText("inmakes",s.getNewPassword());
}

@Then("To close the chrome browser")
public void to_close_the_chrome_browser() {
    closeEntireBrowser();
}

}
