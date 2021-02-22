package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragandDrop {
	WebDriver driver;

	public DragandDrop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]")
	private WebElement InteractionsLinks;
	
	public void InteractionsLinks() {
		InteractionsLinks.click();
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[4]")
	private WebElement Droppable;
	
	public void Droppable() {
		Droppable.click();
	}
	
	
	@FindBy(xpath = "//p[contains(text(),'Dropped!')]")
	private WebElement Dropped;
	
	public String Dropped(){
		return Dropped.getText();
	}
	
	
	@FindBy(xpath = "//div[@id='draggable']")
	private WebElement DragMe;
	
	public WebElement DragMe(){
		return DragMe;
	}
	
	@FindBy(xpath = "//div[@id='simpleDropContainer']//div[@id='droppable']")
	private WebElement DropHere;
	
	public WebElement DropHere(){
		return DropHere;
	}
	
}
