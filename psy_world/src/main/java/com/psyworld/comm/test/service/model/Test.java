package com.psyworld.comm.test.service.model;

/**
 * model TEST
 * @author psy_world
 *
 */
public class Test {
	
	private String testId = "";
	
	private String testMessage = "";

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestMessage() {
		return testMessage;
	}

	public void setTestMessage(String testMessage) {
		this.testMessage = testMessage;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testMessage=" + testMessage + "]";
	}

}
