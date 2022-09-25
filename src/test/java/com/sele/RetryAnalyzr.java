package com.sele;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzr implements IRetryAnalyzer{

	int counter=0;
	int limit=3;
	@Override
	public boolean retry(ITestResult result) {
		if(counter<limit)
		{
			counter++;
			return true;
		}
		return false;
	}

}
