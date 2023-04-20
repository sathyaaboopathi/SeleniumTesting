package org.pojo;

import org.bscl.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePojo extends BaseClass{
	
	public FramePojo() {
		PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath="//a[text()='_1_3w1N']")
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='u_0_5_ZW']")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	

//	public WebElement getLogin() {    
//		return login;
//	}
//
//	public WebElement getPhone() {
//		return phone;
//	}
//
//	public WebElement getEmail() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public WebElement getPassword() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	
	
	
	}


