package com.pratian.billingandgatewayTests.testlisteners;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.mail.MessagingException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.pratian.billingandgateway.exceptions.HtmlElementsException;

import com.pratian.billingandgateway.utils.Driver.Screenshot;

import org.openqa.selenium.WebDriver;

public class TestListener implements ITestListener {
	private static final String[] emailList = { "chitra.nair@pratian.com" };
	private static final String emailMsgTxt = "Please find the report after execution of test cases.";
	private static final String emailFromAddress = "chitra.nair@pratian.com";

	static List<ITestNGMethod> passedtests = new ArrayList<ITestNGMethod>();
	static List<ITestNGMethod> failedtests = new ArrayList<ITestNGMethod>();
	static List<ITestNGMethod> skippedtests = new ArrayList<ITestNGMethod>();

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			failedtests.add(result.getMethod());
			Screenshot screenshot = new Screenshot(getDriverFromBaseTest(result));
			String screenshotName = screenshot.capture(result.getName());
			File file = new File(screenshotName);
			String absolutepath = file.getAbsolutePath();
			ExtentTestManager.getTest().fail("Screenshot",
					MediaEntityBuilder.createScreenCaptureFromPath(absolutepath).build());
		} catch (Exception ex) {
			throw new HtmlElementsException(ex.getMessage());
		}
		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		passedtests.add(result.getMethod());
		ExtentTestManager.getTest().log(Status.PASS, "Test passed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		skippedtests.add(result.getMethod());
		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();

		/*try {
			SendMail.send(emailFromAddress, emailList, "Report", emailMsgTxt);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTestManager.startTest(result.getMethod().getMethodName());
	}

	public static void reportLog(String message) {
		ExtentTestManager.getTest().log(Status.INFO, message);
	}

	public static int getPasscount() {
		return passedtests.size();

	}

	public static int getFailcount() {
		return failedtests.size();

	}

	public static int getSkipcount() {
		return skippedtests.size();

	}

	@SuppressWarnings("unchecked")
	private WebDriver getDriverFromBaseTest(ITestResult result) throws IllegalAccessException {
		WebDriver driver = null;

		try {
			Class<? extends ITestResult> testClass = (Class<? extends ITestResult>) result.getInstance().getClass();

			Class<? extends ITestResult> baseTestClass = (Class<? extends ITestResult>) testClass.getSuperclass();

			Field driverField = baseTestClass.getDeclaredField("driver");
		
		    driverField.get(result.getInstance());
			return driver;
		} catch (SecurityException | NoSuchFieldException | IllegalArgumentException ex) {
			throw new HtmlElementsException("error getting the driver from base test");
		}

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

}
