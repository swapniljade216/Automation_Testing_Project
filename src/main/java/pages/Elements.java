package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.InlineMe;

import core.StepBase;
import utility.UtilityClass;

public class Elements extends StepBase{

	UtilityClass objUtilityClass;



	@FindBy(xpath = "(//*[@type='button'])[1]")
	WebElement Elementclick;

	@FindBy(xpath = "//*[text()=' Text Box']")
	WebElement TextBox;

	@FindBy(xpath = "(//*[@class='form-control'])[1]")
	WebElement 	FullName;

	@FindBy(xpath = "//*[@class='logo-desktop']")
	WebElement logo;

	@FindBy(xpath = "(//*[@class='form-control'])[2]")
	WebElement Email;

	@FindBy(xpath = "//*[@placeholder='Currend Address']")
	WebElement CurrentAddress;

	@FindBy(xpath = "//*[@placeholder='Password']")
	WebElement Pass;

	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement Submit;

	@FindBy(xpath = "(//*[@type='button'])[1]")
	WebElement Elementclick2;

	@FindBy(xpath = " //*[text()=' Check Box']")
	WebElement CheakBox;

	@FindBy(xpath = "( //*[@class='plus'])[1]")
	WebElement PlusArrow;

	@FindBy(xpath = "(//*[@type='checkbox'])[7]")
	WebElement SubLevel;

	@FindBy(xpath = "//*[text()=' Radio Button']")
	WebElement RedioButton;

	@FindBy(xpath = "(//*[@class='form-check-input'])[2]")
	WebElement DoYouLikethisSite;

	@FindBy(xpath = "//*[text()=' Web Tables']")
	WebElement WebTables;

	@FindBy(xpath = "(//*[@class='svg-inline--fa fa-trash'])[2]")
	WebElement DelectBox;

	@FindBy(xpath = "//*[text()=' Buttons']")
	WebElement Buttons;

	@FindBy(xpath ="//*[text()='Click Me']")
	WebElement ClickMe;

	@FindBy(xpath = "//*[text()='Right Click Me']")
	WebElement RightClickMe;

	@FindBy(xpath = "//*[text()='Double Click Me']")
	WebElement DubbleClickMe;

	@FindBy(xpath = "//*[text()='You have Double clicked ']")
	WebElement varificationAfterDubbleClick;


	@FindBy(xpath = "//*[text()=' Links']")
	WebElement link;

	@FindBy(xpath = "//*[text()='Home']")
	WebElement HomeWindowHanding;

	@FindBy(xpath = "//*[text()=' Broken Links - Images']")
	WebElement BrokenLink; 

	@FindBy(xpath = "//*[text()='Click Here for Broken Link']")
	WebElement clickhereForBrokenLink;

	@FindBy(xpath = "//*[@class='container bg-white p-4 text-center mt-5 rounded']")
	WebElement GetText;

	@FindBy(xpath = "//*[text()=' Go Back']")
	WebElement GoBackButton;

	@FindBy(xpath = "//*[text()=' Upload and Download']")
	WebElement UploadFile;

	@FindBy(xpath = "//*[@class='form-control-file']")
	WebElement choosefile;







	public Elements() {

		PageFactory.initElements(driver, this);
	}



	public void ElementsMethod() throws InterruptedException {

		objUtilityClass = new UtilityClass();

		objUtilityClass.scrollInoView(Elementclick);  //This will scroll until the element is in view

		objUtilityClass.ClickOnWebElements(Elementclick, 30);
		objUtilityClass.ClickOnWebElements(TextBox, 20);
		objUtilityClass.SendKeywebElement(FullName, "AJay G");
		String AutomationPractice = logo.getText();
		System.out.println("verification logo :-"+AutomationPractice);
		logo.isDisplayed();
		objUtilityClass.SendKeywebElement(Email, "ajaypatil007@gmail.com");
		objUtilityClass.SendKeywebElement(CurrentAddress, "At.pune Maharashtra, India");
		objUtilityClass.SendKeywebElement(Pass, "Aj@123");
		objUtilityClass.ClickOnWebElements(Submit, 30);
		objUtilityClass.ClickOnWebElements(Elementclick2, 30);
		objUtilityClass.ClickOnWebElements(CheakBox, 20);
		objUtilityClass.ClickOnWebElements(PlusArrow, 10);
		objUtilityClass.ClickOnWebElements(SubLevel, 10);
		objUtilityClass.ClickOnWebElements(RedioButton, 10);
		objUtilityClass.ClickOnWebElements(DoYouLikethisSite, 10);
		objUtilityClass.ClickOnWebElements(WebTables, 10);
		objUtilityClass.ClickOnWebElements(DelectBox, 10);
		objUtilityClass.ClickOnWebElements(Buttons, 10);
		objUtilityClass.ClickOnWebElements(ClickMe, 10);
		objUtilityClass.rightClick(RightClickMe);
		RightClickMe.isDisplayed();
		objUtilityClass.DubbleClick(DubbleClickMe);
		String text = varificationAfterDubbleClick.getText();
		System.out.println("when we duuble click what should come messege :- "+text);
		System.out.println("\n");
		objUtilityClass.ClickOnWebElements(link, 10);

		objUtilityClass.ClickOnWebElements(HomeWindowHanding, 10);
		objUtilityClass.WindowHanding(HomeWindowHanding);

		objUtilityClass.ClickOnWebElements(BrokenLink, 10);
		objUtilityClass.ClickOnWebElements(clickhereForBrokenLink, 10);
		String BrokenPage = GetText.getText();
		System.out.println("Get the text on Broken page :- "+BrokenPage);  // We have verification in this page 
		objUtilityClass.ClickOnWebElements(GoBackButton, 10);
		System.out.println("\n");

		objUtilityClass.ClickOnWebElements(UploadFile, 10);
		objUtilityClass.SendKeywebElement(choosefile, "C:\\Users\\Hp\\OneDrive\\Desktop\\Ajay\\Photo\\abhijeet-gaikwad-EF1nSXZCzcM-unsplash.jpg");
		choosefile.isDisplayed();   // We have File uploaded


	}


}
