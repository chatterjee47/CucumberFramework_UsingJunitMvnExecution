package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyHoveringOver {
	WebDriver driver;

	public VerifyHoveringOver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]")
	private WebElement WidgetsLink;
	
	public void WidgetsLink() {
		WidgetsLink.click();
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[7]")
	private WebElement ToolTips;
	
	public void ToolTips() {
		ToolTips.click();
	}
	
	@FindBy(xpath = "//button[@id='toolTipButton']")
	private WebElement HoverToSee;

	public WebElement HoverToSee(){
		return HoverToSee;
	}
	
	
	@FindBy(xpath = "//div[@class='tooltip-inner']")
	private WebElement TextMessageHoverToSee;

	public String TextMessageHoverToSee(){
		return TextMessageHoverToSee.getText();
	}
	
	@FindBy(xpath = "//input[@id='toolTipTextField']")
	private WebElement toolTipTextField;

	public WebElement toolTipTextField(){
		return toolTipTextField;
	}
	
	@FindBy(xpath = "//div[text()='You hovered over the text field']")
	private WebElement TextMessagetoolTipTextField;
	
	public String TextMessagetoolTipTextField(){
		return toolTipTextField.getText();
	}
	
	
	
}
