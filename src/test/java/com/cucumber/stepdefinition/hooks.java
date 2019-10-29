package com.cucumber.stepdefinition;

import java.io.File;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.base.Base_class;

public class hooks {
	@After
	public void after(Scenario variable) throws Exception {
		if (variable.isFailed()) {
		File des =	Base_class.screenshot(variable.getName());
		Reporter.addScreenCaptureFromPath(des.getAbsolutePath());
		}
	}

}
