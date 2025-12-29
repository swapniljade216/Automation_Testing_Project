package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class StepBase {

	public static WebDriver driver;
	static String url = "https://www.tutorialspoint.com/selenium/practice/register.php";   //navigate to url

	static String browser = "chrome";

	//@Parameters("browser")
	public static void Browserloanch() {  // We have create method of Browser luanch.


		if (browser.equals("chrome")) {

			driver = new ChromeDriver();

		}

		if (browser.equals("firefox")) {

			driver = new FirefoxDriver();

		}

		if (browser.equals("Microsoftedge")) {

			driver = new EdgeDriver();


		}



		// Initialize browser
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Method overloading for implicit wait with seconds
		// we use different time stamps
		System.out.println("Browser has opened");
	}


	public static void Browserclose() {

		driver.close();                   // This will call the overridden click method in ChromeDriver
	}
}
