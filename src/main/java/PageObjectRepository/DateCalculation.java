package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateCalculation {
	WebDriver driver;

	public DateCalculation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]")
	private WebElement WidgetsLink;
	
	public void WidgetsLink() {
		WidgetsLink.click();
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]")
	private WebElement DatePicker;
	
	public void DatePicker() {
		DatePicker.click();
	}
	
	@FindBy(xpath = "//input[@id='datePickerMonthYearInput']")
	private WebElement SelectDate;
	
	public void SelectDate() {
		SelectDate.click();
	}
	
	public String SelectDates() {
		return SelectDate.getAttribute("value");
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
	private WebElement month;
	
	public WebElement month() {
		return month;
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
	private WebElement year;
	
	public WebElement year() {
		return year;
	}
	
}
