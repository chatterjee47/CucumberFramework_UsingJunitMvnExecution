package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WrongdataprovisionOnPracticeForm {
	WebDriver driver;

	public WrongdataprovisionOnPracticeForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/*[1]")
	private WebElement FormLink;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]")
	private WebElement PracticeForm;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement EmailAddress;
	
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	private WebElement Gender;
	
	@FindBy(xpath = "//input[@id='userNumber']")
	private WebElement MobileNumber;
	
	@FindBy(xpath = "//form[@id='userForm']/div/div/button[@id='submit']")
	private WebElement SubmitButton;
	
	public void FormLink() {
		FormLink.click();
	}
	
	public void PracticeForm() {
		PracticeForm.click();
	}
	
	public void firstName(String value) {
		firstName.sendKeys(value);
	}
	
	public void EmailAddress(String value) {
		EmailAddress.sendKeys(value);
	}
	
	public WebElement EmailId() {
		return EmailAddress;
	}
	
	public void MobileNumber(String value) {
		MobileNumber.sendKeys(value);
	}
	
	public WebElement MobileNo() {
		return MobileNumber;
	}
	
	public void Gender() {
		Gender.click();
	}
	
	public void lastName(String value) {
		lastName.sendKeys(value);
	}
	
	public void SubmitButton() {
		SubmitButton.click();
	}
	
	public void verifyRedHighlighted(){
				String colorCode= EmailAddress.getCssValue("border-bottom-color");
				System.out.println("Color code in RGB" + colorCode);
				String expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
				Assert.assertEquals(colorCode, expectedColorCodeInRGB);
	}
}


