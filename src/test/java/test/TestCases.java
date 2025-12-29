package test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.springframework.util.FileCopyUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;

import core.StepBase;
import pages.AlertsFramesWindowPage;
import pages.Elements;
import pages.FormsPage;
import pages.InteractionPage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.WidgetsPage;

public class TestCases extends StepBase {

	RegisterPage objRegi;
	LoginPage ObjLogin;
	FormsPage objFormsPage;
	Elements objElem;
	AlertsFramesWindowPage OBJAFW;
	WidgetsPage objWidgetsMethod;
	InteractionPage objInteractionPage;


	ExtentHtmlReporter HtlmReport;
	ExtentReports Report;
	ExtentTest test;



	@BeforeTest
	public void Browseropen() {

		Browserloanch();

		HtlmReport = new ExtentHtmlReporter("./report/EntentReport.html");
		Report = new ExtentReports();
		Report.attachReporter(HtlmReport);

	}


	@Test(priority = 1, enabled = true)
	public void TestCase() {

		test = Report.createTest("Test start");
		test.log(Status.INFO, "New test start");

		objRegi = new RegisterPage();	


		String title = driver.getTitle();
		//assertEquals(title, true);
		String url = driver.getCurrentUrl();
		System.out.println("Current Title of RegisterPage :-      "+title);
		System.out.println("Current URL of RegisterPage :-         "+url);
		System.out.println("\n");

		objRegi.RegisterMethod();

		test.log(Status.INFO, "test End");


	}

	@Test(priority = 2, enabled = true)
	public void LoginTest() {

		test.log(Status.INFO, "test Second");

		ObjLogin = new LoginPage();

		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("Current URL of LoginPage :-         "+url);
		System.out.println("Current Title of LoginPage :-       "+title);
		System.out.println("\n");

		ObjLogin.LoginMethod();

		test.log(Status.INFO, "test End");

	}

	@Test(priority = 3 , enabled = false)
	public void formTest() {

		test.log(Status.INFO, "test third");

		objFormsPage = new FormsPage(); 


		objFormsPage.formMethod();

		String currentURL = driver.getCurrentUrl();
		String title =  driver.getTitle();

		System.out.println("Current URL of formPage :-      "+currentURL);
		System.out.println("Title of formPage :-            "+title);
		System.out.println("\n");

		test.log(Status.INFO, "test End");


	}

	@Test(priority = 4, enabled = false)
	public void ElementTest() throws InterruptedException {

		test.log(Status.INFO, "test Four");

		objElem = new Elements();

		String currentURL = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("CurrentURL of Elements :-       "+currentURL);
		System.out.println("CurrentTitle of Elements :-     "+title);
		System.out.println("\n");


		objElem.ElementsMethod();

		test.log(Status.INFO, "test End");


	}

	@Test(priority = 5, enabled = false)
	public void AFWPageTestCases() throws InterruptedException {

		test.log(Status.INFO, "test Five");

	    OBJAFW = new AlertsFramesWindowPage();
		
		System.out.println("\n");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("Current Title of RegisterPage :-      "+title);
		System.out.println("Current URL of RegisterPage :-         "+url);
		System.out.println("\n");

		OBJAFW.AlertsFramesWindowMethod();

		test.log(Status.INFO, "test End");




	}
	@Test(priority = 6, enabled = true)
	public void WidgetsTest() throws InterruptedException {

		test.log(Status.INFO, "test six");

		objWidgetsMethod = new WidgetsPage();
		
		System.out.println("\n");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("Current Title of RegisterPage :-      "+title);
		System.out.println("Current URL of RegisterPage :-         "+url);
		System.out.println("\n");

		objWidgetsMethod.WidgetsMethod();

		test.log(Status.INFO, "test End");

	}

	@Test(priority = 7, enabled = true)
	public void InterctionTest() throws InterruptedException {

		test.log(Status.INFO, "test Seven");

		objInteractionPage  = new InteractionPage();
		
		System.out.println("\n");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("Current Title of RegisterPage :-      "+title);
		System.out.println("Current URL of RegisterPage :-         "+url);
		System.out.println("\n");

		objInteractionPage.interactionMethod();

		test.log(Status.INFO, "test End");
	}

	@AfterTest
	public void tearDown() {

		Report.flush();
		/* TakesScreenshot is Interface capturing screenshots.
		 getScreenshotAs(OutputType.FILE) Method: Captures the screenshot and saves it as a file in the temporary memory of the system. 
		The type of the output is specified as FILE.*/

		//FileHandler.copy Method: This copies the screenshot file from temporary storage to a specified location in the project directory.


		File sceenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(sceenshot, new File(".//ScreenShot//Screenshot.png"));
			System.out.println("Screenshot captured succesfully");
			System.out.println("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

		//	Browserclose();



	}



}
