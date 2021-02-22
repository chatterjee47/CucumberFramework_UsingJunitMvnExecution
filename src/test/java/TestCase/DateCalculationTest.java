package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import BaseClass.BrowserSetup;
import PageObjectRepository.CorrectdataprovisionOnPracticeForm;
import PageObjectRepository.DateCalculation;
import Utility.UtilFile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DateCalculationTest {
	static WebDriver driver;
	DateCalculation lp;
	CorrectdataprovisionOnPracticeForm cdop;
	UtilFile util;
	String today;
	Alert alert;
	static Properties prop;
	static FileInputStream fileInput;
	static File file = new File(System.getProperty("user.dir") + "\\config\\file.properties");
	static String ExpectedMessage;
	static String ActualMessage;
	
	
	
	@Before
	public void Configuration(){
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Given("^that I am on the Date Picker page$")
	public void that_I_am_on_the_Date_Picker_page() throws Throwable {
		driver = BrowserSetup.StartBrowser(prop.getProperty("BrowserType"), prop.getProperty("Url"));
		cdop = new CorrectdataprovisionOnPracticeForm(driver);
		cdop.FormLink();
		util = new UtilFile(driver);
		util.pause(500);
		lp = new DateCalculation(driver);
		lp.WidgetsLink();
		util.pause(500);
		util.scrolltobottom();
		util.pause(500);
		lp.DatePicker();
		util.pause(500);
		util.scrollTop();
		util.pause(500);
	}

	@When("^calculate the date exactly a month from today date$")
	public void calculate_the_date_exactly_a_month_from_today_date() throws Throwable {
		util.pause(500);
		lp.SelectDate();
		util.pause(500);
	}

	@When("^I select the correct year using the date picker$")
	public void i_select_the_correct_year_using_the_date_picker() throws Throwable {
		util.pause(500);
		util.SelectDropdown(lp.year(), "2021");
	}

	@When("^I select the correct month using the date picker$")
	public void i_select_the_correct_month_using_the_date_picker() throws Throwable {
		util.pause(500);
		util.SelectDropdown(lp.month(), "March");
	}

	@When("^I select the correct day using the date picker$")
	public void i_select_the_correct_day_using_the_date_picker() throws Throwable {
		today = util.getCurrentDay();
        util.pause(1000);
        util.todaysdatepicker(today);
        util.pause(1000);
	}

	@Then("^the chosen date shall be shown on the Select Date section$")
	public void the_chosen_date_shall_be_shown_on_the_Select_Date_section() throws Throwable {
		ExpectedMessage= lp.SelectDates();
		System.out.println("Expected Message : " + ExpectedMessage);
		util.pause(3000);
		driver.close();
	}


}
