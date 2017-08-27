package com.haloerp.selenium.action;

import com.haloerp.selenium.AbstractAction;
import com.haloerp.selenium.TestStatus;
import com.haloerp.selenium.TestcaseContext;

public class Fail extends AbstractAction {

	public TestStatus execute(TestcaseContext context) {
		return TestStatus.FAIL;
	}

}