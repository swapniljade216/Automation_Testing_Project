package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import utility.UtilityClass;

public class InteractionPage extends StepBase {


	UtilityClass ObjUtilityClass;

	@FindBy(xpath = "(//*[@class='accordion-button collapsed'])[5]")
	WebElement Interaction;

	@FindBy(xpath = "//*[text()=' Sortable']")
	WebElement Shortable;

	@FindBy(xpath = "//*[@id='nav-profile-tab']")
	WebElement Grid;

	@FindBy(xpath = "(//*[@class='btn btn-primary'])[1]")
	WebElement Button;

	@FindBy(xpath = "(//*[@class='btn btn-primary'])[2]")
	WebElement Button2;

	@FindBy(xpath = "(//*[@class='btn btn-primary'])[3]")
	WebElement Button3;
	
	@FindBy(xpath = "//*[text()=' Selectable']")
	WebElement SelectbleModule;
	
	@FindBy(xpath = "(//*[@class='list-group-li'])[1]")
	WebElement ListGroup;
	
	@FindBy(xpath = "//*[@id='nav-profile-tab']")
	WebElement Grid_01;
	
	@FindBy(xpath = "//*[text()='3']")
	WebElement GridDigit;
	
	@FindBy(xpath = "//*[text()=' Droppable']")
	WebElement Droppable;
	
	@FindBy(xpath = "//*[@id='draggable']")
	WebElement Drag;
	
	@FindBy(xpath = "//*[@id='droppable']")
	WebElement Drop;
	
	@FindBy(xpath = "(//*[@id='nav-profile-tab'])[1]")
	WebElement AcceptButton;
	
	@FindBy(xpath = "(//*[@id='div2'])")
	WebElement DragMe;
	
	@FindBy(xpath = "(//*[@id='div1'])")
	WebElement DropHere;
	
	
	
	
	


	public InteractionPage() {
		PageFactory.initElements(driver, this);
	}

	public void interactionMethod() throws InterruptedException {

		ObjUtilityClass = new UtilityClass();

		ObjUtilityClass.scrollInoView(Interaction);
		ObjUtilityClass.ClickOnWebElements(Interaction, 20);
		ObjUtilityClass.ClickOnWebElements(Shortable, 20);
		ObjUtilityClass.ClickOnWebElements(Grid, 20);
		ObjUtilityClass.ClickOnWebElements(Button, 20);
		ObjUtilityClass.ClickOnWebElements(Button2, 10);
		ObjUtilityClass.ClickOnWebElements(Button3, 10);
		ObjUtilityClass.ClickOnWebElements(SelectbleModule, 20);
		ObjUtilityClass.ClickOnWebElements(ListGroup, 10);
		ObjUtilityClass.ClickOnWebElements(Grid_01, 10);
		ObjUtilityClass.ClickOnWebElements(GridDigit, 30);
		
		ObjUtilityClass.scrollInoView(Droppable);
		ObjUtilityClass.ClickOnWebElements(Droppable, 20);
		
		ObjUtilityClass.MouseMoveAndClick(Drag, Drop);
		
		ObjUtilityClass.ClickOnWebElements(AcceptButton, 20);
		ObjUtilityClass.MouseMoveAndClick(DragMe, DropHere);
		System.out.println("Successful lounch Drag and drop");;
		


	}

}
