package com.myframework.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public void reports() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/SwagTest.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);

		extent.createTest("MyFrameWorkTest").log(Status.PASS,
				"This is a logging event for MyFirst FrameWork Test, and it passed!");
		extent.flush();

	}

}
