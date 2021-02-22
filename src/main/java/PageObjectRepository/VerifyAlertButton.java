package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyAlertButton {
	WebDriver driver;

	public VerifyAlertButton(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]")
	private WebElement AlertFrameWindow;
	
	public void AlertFrameWindow() {
		AlertFrameWindow.click();
	}
	
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]")
	private WebElement AlertWindow;
	
	public void AlertWindow() {
		AlertWindow.click();
	}
	
	
	@FindBy(xpath = "//button[@id='timerAlertButton']")
	private WebElement timerAlertButton;
	
	public void timerAlertButton() {
		timerAlertButton.click();
	}
	
	
	

}
