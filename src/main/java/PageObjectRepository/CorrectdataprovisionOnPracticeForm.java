package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CorrectdataprovisionOnPracticeForm {
	WebDriver driver;

	public CorrectdataprovisionOnPracticeForm(WebDriver driver) {
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
	
	
	public String ValidateGender() {
		return Gender.getText();
	}
	
	@FindBy(xpath = "//input[@id='userNumber']")
	private WebElement MobileNumber;
	
	public String MobileNumber() {
		return MobileNumber.getAttribute("value");
	}
	
	@FindBy(xpath = "//form[@id='userForm']/div/div/button[@id='submit']")
	private WebElement SubmitButton;
	
	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	private WebElement DateOfBirth;
	
	public String ValidateDateOfBirth() {
		return DateOfBirth.getText();
	}
	
	public String ValidDateOfBirth() {
		return DateOfBirth.getAttribute("value");
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
	public WebElement MonthDropdown;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
	public WebElement YearDropdown;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]")
	public WebElement DateSelection;

	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")
	private WebElement Subjects;
	

	public String ValidSubjects() {
		return Subjects.getAttribute("value");
	}
	
	public String ValidateSubjects() {
		return Subjects.getText();
	}
	
	public void Subjects(String value) {
		Actions actions = new Actions(driver);
		actions.moveToElement(Subjects);
		actions.click();
		actions.sendKeys(value);
		actions.build().perform();
		
	}
	
	@FindBy(xpath = "//label[contains(text(),'Sports')]")
	private WebElement Hobbies_Sports;
	
	public String ValidateHobbies_Sports() {
		return Hobbies_Sports.getText();
	}
	
	public String ValidHobbies_Sports() {
		return Hobbies_Sports.getAttribute("value");
	}
	
	
	public void Hobbies_Sports() {
		Hobbies_Sports.click();
	}
	
	@FindBy(xpath = "//label[contains(text(),'Reading')]")
	private WebElement Hobbies_Reading;
	
	public void Hobbies_Reading() {
		Hobbies_Reading.click();
	}
	
	public String ValidateHobbies_Reading() {
		return Hobbies_Reading.getText();
	}
	
	public String ValidHobbies_Reading() {
		return Hobbies_Reading.getAttribute("value");
	}
	
	@FindBy(xpath = "//input[@id='uploadPicture']")
	private WebElement UploadPicture;
	
	public String ValidateUploadPicture() {
		return UploadPicture.getText();
	}

	public String ValidUploadPicture() {
		return UploadPicture.getAttribute("value");
	}
	
	public void UploadPicture(String value){
		UploadPicture.sendKeys(value);
	}

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	private WebElement CurrentAddress;
	
	public void CurrentAddress(String value){
		CurrentAddress.sendKeys(value);
	}
	
	public String ValidCurrentAddress() {
		return CurrentAddress.getAttribute("value");
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]")
	private WebElement State;
	
	public String ValidState() {
		return State.getAttribute("value");
	}
	
	public String ValidateState() {
		return State.getText();
	}
	
	public void State() {
		State.click();
	}
	
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[10]/div[3]")
	private WebElement City;
	
	public String ValidCity() {
		return City.getAttribute("value");
	}
	
	public String ValidateCity() {
		return City.getText();
	}
	
	public void City() {
		City.click();
	}
	
	@FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
	private WebElement SuccessfulMessage;
	
	public String SuccessfulMessage() {
		return SuccessfulMessage.getText();
	}
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	private WebElement StudentName;
	
	public String StudentName() {
		return StudentName.getText();
	}
	
	@FindBy(xpath = "//tbody/tr[2]/td[2]")
	private WebElement StudentEmail;
	
	public String StudentEmail() {
		return StudentEmail.getText();
	}
	
	@FindBy(xpath = "//tbody/tr[3]/td[2]")
	private WebElement GenderDisplay;
	
	public String GenderDisplay() {
		return GenderDisplay.getText();
	}
	
	@FindBy(xpath = "//tbody/tr[4]/td[2]")
	private WebElement VerifyMobileNo;
	
	public String VerifyMobileNo() {
		return VerifyMobileNo.getText();
	}
	
	@FindBy(xpath = "//tbody/tr[5]/td[2]")
	private WebElement verifyDateOfBirth;
	
	public String verifyDateOfBirth() {
		return verifyDateOfBirth.getText();
	}
	
	@FindBy(xpath = "//tbody/tr[6]/td[2]")
	private WebElement VerifySubjects;
	
	public String VerifySubjects() {
		return VerifySubjects.getText();
	}
	
	@FindBy(xpath = "//tbody/tr[7]/td[2]")
	private WebElement VerifyHobbies;
	
	public String VerifyHobbies() {
		return VerifyHobbies.getText();
	}
	
	@FindBy(xpath = "//tbody/tr[8]/td[2]")
	private WebElement VerifyPicture;
	
	public String VerifyPicture() {
		return VerifyPicture.getText();
	}
	
	@FindBy(xpath = "//tbody/tr[9]/td[2]")
	private WebElement VerifyAddress;
	
	public String VerifyAddress() {
		return VerifyAddress.getText();
	}
	
	@FindBy(xpath = "//tbody/tr[10]/td[2]")
	private WebElement VerifyStateCity;
	
	public String VerifyStateCity() {
		return VerifyStateCity.getText();
	}
	
	@FindBy(xpath = "//button[@id='closeLargeModal']")
	private WebElement CloseButton;
	
	public void CloseButton() {
		CloseButton.click();
	}
	
	
	public void FormLink() {
		FormLink.click();
	}
	
	public void PracticeForm() {
		PracticeForm.click();
	}
	
	public void firstName(String value) {
		firstName.sendKeys(value);
	}
	
	public String firstName() {
		return firstName.getAttribute("value");
	}
	
	public void EmailAddress(String value) {
		EmailAddress.sendKeys(value);
	}
	
	public String EmailAddress() {
		return EmailAddress.getAttribute("value");
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
	
	public String ValidGender() {
		return Gender.getAttribute("value");
	}
	
	public void lastName(String value) {
		lastName.sendKeys(value);
	}
	
	public String lastName() {
		return lastName.getAttribute("value");
	}
	
	public void SubmitButton() {
		SubmitButton.click();
	}
	
	public void DateOfBirth() {
		DateOfBirth.click();
	}
	
	public WebElement MonthDropdown() {
		return MonthDropdown;
	}
	
	public WebElement YearDropdown() {
		return YearDropdown;
	}
	
	public void DateSelection() {
		DateSelection.click();
	}
	
	public void SelectDropdown(WebElement element , String value){
		Select selectdropdown =  new Select(element);
		selectdropdown.selectByVisibleText(value);
	}
	
	
}


