package org.stepDefinition;

import org.bscl.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass1 extends BaseClass {
	
@Before
private void precondition() {
	launchBrowser();
	windowMaximize();
}
@After
private void postcondition() {
	closeEntireBrowser();
}

}
