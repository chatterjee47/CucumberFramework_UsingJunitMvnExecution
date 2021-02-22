package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogs {
	WebDriver driver;

	public ModalDialogs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]")
	private WebElement AlertFrameWindow;
	
	public void AlertFrameWindow() {
		AlertFrameWindow.click();
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]")
	private WebElement ModalDialogs;
	
	public void ModalDialog() {
		ModalDialogs.click();
	}
	
	@FindBy(xpath = "//button[@id='showSmallModal']")
	private WebElement SmallModal;
	
	public void SmallModal() {
		SmallModal.click();
	}
	
	@FindBy(xpath = "//button[@id='closeSmallModal']")
	private WebElement closeSmallModal;
	
	public void closeSmallModal() {
		closeSmallModal.click();
	}
	
	
}
