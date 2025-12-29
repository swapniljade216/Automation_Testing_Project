package utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import core.StepBase;

public class UtilityClass extends StepBase {


	public void AlertAccept(String element, WebDriver driver) {

		Alert alert = driver.switchTo().alert();
		String validation = alert.getText();
		System.out.println("After execution,the Popup text MSG will be displayed. :-"+validation);
		alert.accept();




	}

	public void ClickOnWebElements(WebElement element, long waitOnSecound) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitOnSecound));   // Applied to a specified element only..
		WebElement elements = null;                                                          //Method overloading
		elements = wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();

	}

	public void SendKeywebElement(WebElement element , String text) {

		element.clear();
		//	element.isDisplayed();
		element.sendKeys(text);
	}

	public void MouseMoveAndClick(WebElement element, WebElement Elements) {

		Actions action = new Actions(driver);
		action.clickAndHold(element).moveToElement(Elements).release().perform();
	}

	public void DropDown(WebElement element, String text) {

		Select select = new Select(element);       // We have three method in dropDown SelectByValue, SelectByText, Select by index
		select.selectByValue(text);
	}

	public void scrollInoView(WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;             // This will scroll until the element is in view
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000); 
	}

	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();  // we can use right click method.

	}

	public void DubbleClick(WebElement element) {

		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();   //We can use dubble click method.
	}

	public void WindowHanding(WebElement element) {

		String windowHandle = driver.getWindowHandle();       // Gets the current window handle
		Set<String>windowHandleAll = driver.getWindowHandles(); // retrun ID's of multiple browser windosw.

		// First method - Iterator()
		Iterator<String>iterator = windowHandleAll.iterator();        // Iterator to loop through windows

		while (iterator.hasNext()) {

			String childwindow = iterator.next();                         

			if (!windowHandle.equalsIgnoreCase(childwindow)) {            // If it's a new window
				driver.switchTo().window(childwindow);                          // Switches to new window
				driver.close();     // close the single browser driver



			}
			driver.switchTo().window(windowHandle);                           // Switches back to the main window





		}
	}
	public void iframes(String text, int digit) {

		driver.switchTo().frame(digit);

	}

}
