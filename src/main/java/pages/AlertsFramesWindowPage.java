package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import core.StepBase;
import utility.UtilityClass;

public class AlertsFramesWindowPage extends StepBase{


	UtilityClass ObjUtilityClass;


	@FindBy(xpath = "//*[text()=' Alerts, Frames & Windows ']")
	WebElement AFW;

	@FindBy(xpath = "//*[text()=' Browser Windows']")
	WebElement BrowserWindow;

	@FindBy(xpath = "(//*[@class='btn btn-primary'])[1]")
	WebElement NewTab;

	@FindBy(xpath = "(//*[@class='btn btn-primary'])[2]")
	WebElement NewBrowser;

	@FindBy(xpath = "(//*[@class='btn btn-primary'])[2]")
	WebElement NewBrowserMessage;

	@FindBy(xpath = "//*[text()=' Alerts']")
	WebElement Alerts;

	@FindBy(xpath = "//*[text()='Alert']")
	WebElement AlertButton;

	@FindBy(xpath = "(//*[text()='Click Me'])[1]")
	WebElement AlertWillAppearAfter5seconds;

	@FindBy(xpath = "(//*[text()='Click Me'])[2]")
	WebElement BoxWillBeAppear;

	@FindBy(xpath = "(//*[text()='Click Me'])[3]")
	WebElement PromptWillBeAppear;

	@FindBy(xpath = "//*[text()=' Frames']")
	WebElement Frames;

	@FindBy(xpath = "//*[text()=' Modal Dialogs']")
	WebElement ModalDialogs;

	@FindBy(xpath = "(//*[@class='btn btn-primary'])[1]")
	WebElement SmallModalPopup;

	@FindBy(xpath = "(//*[@class='modal-body'])[1]")
	WebElement verifacationPopUp;

	@FindBy(xpath = "(//*[text()='Close'])[1]")
	WebElement closeButton_1;

	@FindBy(xpath= "(//*[@class='btn btn-primary'])[2]")
	WebElement largeModal;

	@FindBy(xpath = "(//*[text()='Close'])[2]")
	WebElement closeButton_2;




	public AlertsFramesWindowPage() {
		PageFactory.initElements(driver, this);
	}

	public void AlertsFramesWindowMethod() throws InterruptedException {

		ObjUtilityClass = new UtilityClass();  // We have create object of utilityClass

		ObjUtilityClass.scrollInoView(AFW);
		ObjUtilityClass.ClickOnWebElements(AFW, 20); 
		ObjUtilityClass.ClickOnWebElements(BrowserWindow, 20);

		ObjUtilityClass.ClickOnWebElements(NewTab, 10);
		ObjUtilityClass.WindowHanding(NewTab);          // we have window handle
		ObjUtilityClass.ClickOnWebElements(NewBrowser, 10);
		ObjUtilityClass.WindowHanding(NewBrowser);
		ObjUtilityClass.ClickOnWebElements(NewBrowserMessage, 10);
		ObjUtilityClass.WindowHanding(NewBrowserMessage);
		ObjUtilityClass.ClickOnWebElements(Alerts, 20);


		System.out.println("Before execution a text message should be displayed.  :- "+"Click Button to see alert");
		ObjUtilityClass.ClickOnWebElements(AlertButton, 10);  // We have handle PopUp
		ObjUtilityClass.AlertAccept(null, driver);
		System.out.println("\n");
		
//		System.out.println("before executoion a text a text message should e displaye");

		//		 System.out.println("Before execution a text message should be displayed.  :- "+"On button click, alert will appear after 5 seconds");
		//		 ObjUtilityClass.ClickOnWebElements(AlertWillAppearAfter5seconds, 40);
		//		 ObjUtilityClass.AlertAccept(driver);
		//		 System.out.println("\n");

		System.out.println("Before execution a text message should be displayed.  :- "+"On button click, confirm box will appear");
		ObjUtilityClass.ClickOnWebElements(BoxWillBeAppear, 30);
		ObjUtilityClass.AlertAccept(null, driver);
		System.out.println("\n");

		System.out.println("Before execution a text message should be displayed.  :- "+"On button click, prompt box will appear");
		ObjUtilityClass.ClickOnWebElements(PromptWillBeAppear, 30);
		ObjUtilityClass.AlertAccept("AJay", driver);
		System.out.println("\n");

		//		 ObjUtilityClass.ClickOnWebElements(Frames, 20);
		//		 ObjUtilityClass.iframes("Iframe 1", 0);
		ObjUtilityClass.ClickOnWebElements(ModalDialogs, 10);
		ObjUtilityClass.ClickOnWebElements(SmallModalPopup, 10);
		
		ObjUtilityClass.ClickOnWebElements(closeButton_1, 10);
		ObjUtilityClass.ClickOnWebElements(largeModal, 10);
		ObjUtilityClass.ClickOnWebElements(closeButton_2, 10);

















	}

}
