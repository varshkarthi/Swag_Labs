package org.runner;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClassReport {

	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(SuiteLevelClass.class);
		
		int failureCount = runClasses.getFailureCount();
		System.out.println("Failure Count : "+ failureCount);
		
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("IgnoreCount : "+ ignoreCount);
		
		int runCount = runClasses.getRunCount();
		System.out.println("RunCount : "+ runCount);
		
		long runTime = runClasses.getRunTime();
		System.out.println("Run Time : "+ runTime);
		
		List<Failure> failures = runClasses.getFailures();
		
		for (Failure failure : failures) {
			
			String message = failure.getMessage();
			System.out.println(message);
			
			Throwable exception = failure.getException();
			System.out.println("Exception : "+ exception);		
			
		}
		
		boolean wasSuccessful = runClasses.wasSuccessful();
		System.out.println(wasSuccessful);
	
}
}