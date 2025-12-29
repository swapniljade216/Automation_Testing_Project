package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import utility.UtilityClass;

public class WidgetsPage extends StepBase {

	UtilityClass ObjUtilityClass;

	@FindBy(xpath = "//*[text()=' Widgets']")
	WebElement WidgetsModel;

	@FindBy(xpath = "//*[text()=' Accordion']")
	WebElement AccrdionButton;

	@FindBy(xpath = "//*[@id='headingTwentyOne']")
	WebElement WhatIsLoremIpsum;

	@FindBy(xpath = "(//*[@class='text-justify'])[1]")
	WebElement  Textjustify;

	@FindBy(xpath = "(//*[@id='headingTwentyTwo'])[1]")
	WebElement whyDoWeUseIt;

	@FindBy(xpath = "(//*[@class='text-justify'])[2]")
	WebElement justify2;

	@FindBy(xpath = "(//*[@type='button'])[8]")
	WebElement WhereCanGetSome;

	@FindBy(xpath = "(//*[@class='text-justify'])[3]")
	WebElement Justify3;

	@FindBy(xpath = "(//*[@class='accordion-button collapsed'])[4]")
	WebElement Wigh;

	@FindBy(xpath = "(//*[@class='svg-inline--fa fa-arrow-right'])[19]")
	WebElement AutoComp;

	@FindBy(id = "tags")
	WebElement Tags;

	@FindBy(xpath = "//*[text()='Java']")
	WebElement Java;

	@FindBy(xpath = "//*[text()=' Progress Bar']")
	WebElement ProgressBar;

	@FindBy(xpath = "//*[@id='startProgressTimer']")
	WebElement Start;

	@FindBy(xpath = "//*[text()=' Tabs']")
	WebElement Tabs;

	@FindBy(xpath = "(//*[@class='text-justify'])[1]")
	WebElement Justify;

	@FindBy(xpath = "//*[@id='nav-profile-tab']")
	WebElement Profile;

	@FindBy(xpath = "(//*[@class='text-justify'])[2]")
	WebElement Test_Justify;

	@FindBy(xpath = "//*[@id='nav-contact-tab']")
	WebElement Contact;

	@FindBy(xpath = "(//*[@class='text-justify'])[3]")
	WebElement TextJustity4;

	@FindBy(xpath = "//*[text()=' Select Menu']")
	WebElement SelectMenu;

	//	@FindBy(xpath = "//*[text()='Please select...']")
	//	WebElement MultiSelect;

	@FindBy(xpath = "//*[text()=' Scoll Down']")
	WebElement ScrollDown;

	@FindBy(xpath = "(//*[@class='text-justify'])[1]")
	WebElement WhatisLoremIpsum;

	@FindBy(xpath = "(//*[@class='text-justify'])[2]")
	WebElement WhyDoWeUseIt1;

	@FindBy(xpath = "(//*[@class='text-justify'])[3]")
	WebElement WhyDoWEUseIT2;

	@FindBy(xpath = "(//*[@class='text-justify'])[4]")
	WebElement WHYDOWEUSEIT3;

	@FindBy(xpath = "(//*[@class='text-justify'])[5]")
	WebElement WherecanIGetSome2;

	@FindBy(xpath = "(//*[@class='text-justify'])[6]")
	WebElement WhereCanIGetSOME3;

	@FindBy(xpath = "(//*[@class='text-justify'])[7]")
	WebElement WhereCANIGETSOME4;

	@FindBy(xpath = "(//*[@class='text-justify'])[8]")
	WebElement WhereDoesitcomefrom1;

	@FindBy(xpath = "(//*[@class='text-justify'])[9]")
	WebElement WhereDoesitcomefrom2;

	@FindBy(xpath = "(//*[@class='text-justify'])[10]")
	WebElement WhereDoesitcomefrom3;

	@FindBy(xpath = "(//*[@class='text-justify'])[11]")
	WebElement WhereDoesitcomefrom4;

	@FindBy(xpath = "//*[text()=' Horizontal Scroll']")
	WebElement HorizontalScroll;

	@FindBy(xpath = "(//*[@class='text-justify'])[1]")
	WebElement HorizontalScroll1;

	@FindBy(xpath = "(//*[@class='text-justify'])[2]")
	WebElement WhyDoWeUseItHorizontalScroll;

	@FindBy(xpath = "(//*[@class='text-justify'])[3]")
	WebElement WhyDoWeUseItHorizontalScroll2;

	@FindBy(xpath = "(//*[@class='text-justify'])[4]")
	WebElement WhyDoWeUseItHorizontalScroll3;




	public WidgetsPage() {
		PageFactory.initElements(driver, this);

	}

	public void WidgetsMethod() throws InterruptedException {

		ObjUtilityClass = new UtilityClass();

		// ObjUtilityClass.scrollInoView(WidgetsModel);
		ObjUtilityClass.ClickOnWebElements(WidgetsModel, 30);
		ObjUtilityClass.ClickOnWebElements(AccrdionButton, 20);

		ObjUtilityClass.ClickOnWebElements(WhatIsLoremIpsum, 10);
		String Text = Textjustify.getText();
		System.out.println("cheak the this text 1 :-                              "+Text);

		ObjUtilityClass.ClickOnWebElements(whyDoWeUseIt, 10);
		String text2  = justify2.getText();
		System.out.println("cheak the text is correct or not 2 :-                  "+text2);

		//		ObjUtilityClass.scrollInoView(WhereCanGetSome);
		//		ObjUtilityClass.ClickOnWebElements(WhereCanGetSome, 20);
		//		String text3 = Justify3.getText();
		//		System.out.println("Get the text 3 :- "+text3);

		ObjUtilityClass.ClickOnWebElements(Wigh, 10);

		ObjUtilityClass.ClickOnWebElements(AutoComp, 10);
		ObjUtilityClass.SendKeywebElement(Tags, "java");
		ObjUtilityClass.ClickOnWebElements(Java, 10);

		ObjUtilityClass.scrollInoView(ProgressBar);
		ObjUtilityClass.ClickOnWebElements(ProgressBar, 10);
		ObjUtilityClass.ClickOnWebElements(Start, 30);

		ObjUtilityClass.scrollInoView(Tabs);
		ObjUtilityClass.ClickOnWebElements(Tabs, 10);
		String text3 = Justify.getText();
		System.out.println("which text is show in display :-                "+text3);

		ObjUtilityClass.ClickOnWebElements(Profile, 20);
		String ProfileText = Test_Justify.getText();
		System.out.println("Which text is show in display :-                "+ProfileText);

		ObjUtilityClass.ClickOnWebElements(Contact, 10);
		String ContactTest = TextJustity4.getText();

		ObjUtilityClass.scrollInoView(SelectMenu);
		ObjUtilityClass.ClickOnWebElements(SelectMenu, 20);

		ObjUtilityClass.scrollInoView(ScrollDown);
		ObjUtilityClass.ClickOnWebElements(ScrollDown, 10);
		String Text3 = WhatisLoremIpsum.getText();
		System.out.println("In Scroll Down page should be display Massege :-                "+Text3);

		ObjUtilityClass.scrollInoView(WhyDoWeUseIt1);
		String Text4 = WhyDoWeUseIt1.getText();
		System.out.println("In Scroll down page should be display massege :-                "+Text4);

		ObjUtilityClass.scrollInoView(WhyDoWEUseIT2);
		String Text5 = WhyDoWEUseIT2.getText();
		System.out.println("In scroll down should be display Massege :-                      "+Text5);

		ObjUtilityClass.scrollInoView(WhereCanIGetSOME3);
		String Text6 = WHYDOWEUSEIT3.getText();
		System.out.println("In scroll down page should be display massege :-                  "+Text6);

		ObjUtilityClass.scrollInoView(WherecanIGetSome2);
		String Text7 = WherecanIGetSome2.getText();
		System.out.println("In Scroll down page should be display massege :-                   "+Text7);

		ObjUtilityClass.scrollInoView(WhereCanIGetSOME3);
		String Text8 = WhereCanIGetSOME3.getText();
		System.out.println("In scroll down page should be display massege :-                    "+Text8);

		ObjUtilityClass.scrollInoView(WhereCANIGETSOME4);
		String Text9 = WhereCANIGETSOME4.getText();
		System.out.println("In scroll down page should be display massege :-                    "+Text9);


		ObjUtilityClass.scrollInoView(WhereDoesitcomefrom1);
		String Text10 = WhereDoesitcomefrom1.getText();
		System.out.println("In scroll down page should be display massege :-                    "+Text10);

		ObjUtilityClass.scrollInoView(WhereDoesitcomefrom2);
		String Text11 = WhereDoesitcomefrom2.getText();
		System.out.println("In scroll down page should be display massege :-                     "+Text11);

		ObjUtilityClass.scrollInoView(WhereDoesitcomefrom3);
		String Text12 = WhereDoesitcomefrom3.getText();
		System.out.println("In scroll down page should be display massege :-                     "+Text12);


		ObjUtilityClass.scrollInoView(WhereDoesitcomefrom4);
		String Text13 = WhereDoesitcomefrom4.getText();
		System.out.println("In scroll down page should be display massege :-                      "+Text13);

		ObjUtilityClass.scrollInoView(HorizontalScroll);
		ObjUtilityClass.scrollInoView(HorizontalScroll);
		ObjUtilityClass.ClickOnWebElements(HorizontalScroll, 30);

		String Text14 = HorizontalScroll1.getText();
		System.out.println("HorizontalScroll page should be display massege :-                    "+Text14);
 
		ObjUtilityClass.scrollInoView(WhyDoWeUseItHorizontalScroll);
		ObjUtilityClass.ClickOnWebElements(WhyDoWeUseItHorizontalScroll, 10);
		String Text15 = WhyDoWeUseItHorizontalScroll.getText();
		System.out.println("HorizontalScroll page should be display massege :-                     "+Text15);

		ObjUtilityClass.ClickOnWebElements(WhyDoWeUseItHorizontalScroll2, 10);
		String Text16 = WhyDoWeUseItHorizontalScroll2.getText();
		System.out.println("In HorizontalScroll page should be display massege :-                   "+Text16);


		ObjUtilityClass.ClickOnWebElements(WhyDoWeUseItHorizontalScroll3, 10);
		String Text17 = WhyDoWeUseItHorizontalScroll3.getText();
		System.out.println("In HorizontalScroll page should be display massege :-                    "+Text17);




	}




}
