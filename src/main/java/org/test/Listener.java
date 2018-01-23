package org.test;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class Listener extends RunListener {
	@Override
	public void testRunStarted(Description description) throws Exception {
		System.out.println("testRunSatrted");
	}
}
