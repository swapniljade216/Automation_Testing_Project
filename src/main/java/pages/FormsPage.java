package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import utility.UtilityClass;

public class FormsPage extends StepBase{
	
	UtilityClass objUtilityClass = new UtilityClass();
	
	@FindBy(xpath = "(//*[@type='button'])[2]")
	WebElement FormsButton;
	
	@FindBy(xpath = "//*[text()=' Practice Form']")
	WebElement practiceForm;
	
	@FindBy(xpath = "//*[@placeholder='First Name']")
	WebElement FirstName;
	
	@FindBy(xpath = "//*[@placeholder='name@example.com']")
	WebElement Email;
	
	@FindBy(xpath = "(//*[@class='form-check-input mt-0'])[1]")
	WebElement Gender;
	
	@FindBy(xpath = "//*[@placeholder='Enter Mobile Number']")
	WebElement Mobile;
	
	@FindBy(xpath = "//*[@type='date']")
	WebElement DateOfBirh;
	
	@FindBy(xpath = "//*[@placeholder='Enter Subject']")
	WebElement Subjects;
	
	@FindBy(xpath = "(//*[@class='form-check-input mt-0'])[4]")
	WebElement Habbies;
	
	@FindBy(xpath = "//*[@class='form-check-input mt-0 file-input']")
	WebElement FileUpload;
	
	
	@FindBy(xpath = "//*[@placeholder='Currend Address']")
	WebElement Address;
	
	@FindBy(xpath = "(//*[@class='form-select'])[1]")
	WebElement State;
	
	@FindBy(xpath = "(//*[@class='form-select'])[2]")
	WebElement city;
	
	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement Login;
	
	
	
	public FormsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void formMethod() {
		
		objUtilityClass.ClickOnWebElements(FormsButton, 20);
		objUtilityClass.ClickOnWebElements(practiceForm, 30);
		objUtilityClass.SendKeywebElement(FirstName, "Ajay");
		objUtilityClass.SendKeywebElement(Email, "ajay999@gmail.com");
		objUtilityClass.ClickOnWebElements(Gender, 20);
		objUtilityClass.SendKeywebElement(Mobile, "4744347844");
		objUtilityClass.SendKeywebElement(DateOfBirh, "6"+"03"+"2024");
		objUtilityClass.SendKeywebElement(Subjects, "I am interested  read chemisry");
		objUtilityClass.ClickOnWebElements(Habbies, 20);

		objUtilityClass.SendKeywebElement(FileUpload, "C:\\Users\\Hp\\OneDrive\\Desktop\\Ajay\\Photo\\abhijeet-gaikwad-EF1nSXZCzcM-unsplash.jpg");
		FileUpload.isDisplayed();
		
		objUtilityClass.SendKeywebElement(Address, "Pune");
		objUtilityClass.DropDown(State, "Uttar Pradesh");
		objUtilityClass.DropDown(city, "Lucknow");
		objUtilityClass.ClickOnWebElements(Login, 30);
		
		
	}

}
