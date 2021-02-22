package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BaseClass.BrowserSetup;
import PageObjectRepository.WrongdataprovisionOnPracticeForm;
import Utility.UtilFile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WrongdataprovisionOnPracticeFormTest {
	static WebDriver driver;
	WrongdataprovisionOnPracticeForm lp;
	UtilFile util;
	Alert alert;
	static Properties prop;
	static FileInputStream fileInput;
	static File file = new File(System.getProperty("user.dir") + "\\config\\file.properties");
	static String colorCode;
	static String expectedColorCodeInRGB;
	
	
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
	
	
	@Given("^I go to the Practice Form page$")
	public void i_go_to_the_Practice_Form_page() throws Throwable {
		driver = BrowserSetup.StartBrowser(prop.getProperty("BrowserType"), prop.getProperty("Url"));
		lp = new WrongdataprovisionOnPracticeForm(driver);
		lp.FormLink();
		util = new UtilFile(driver);
		util.pause(3000);
		lp.PracticeForm();
		util.pause(3000);
	}

	@When("^I type in Name as a numeric value \"([^\"]*)\"$")
	public void i_type_in_Name_as_a_numeric_value(String value) throws Throwable {
		lp.firstName(value);
		util.pause(3000);
	}

	@When("^I type in Last Name \"([^\"]*)\"$")
	public void i_type_in_Last_Name(String value) throws Throwable {
		lp.lastName(value);
		util.pause(3000);
	}

	@When("^I type in wrong Email Id \"([^\"]*)\"$")
	public void i_type_in_wrong_Email_Id(String value) throws Throwable {
		lp.EmailAddress(value);
		util.pause(3000);
	    
	}

	@When("^I select Gender Male$")
	public void i_select_Gender_Male() throws Throwable {
		lp.Gender();
		util.pause(3000);
	    
	}

	@When("^I type in wrong mobile number with less that ten numbers \"([^\"]*)\"$")
	public void i_type_in_wrong_mobile_number_with_less_that_ten_numbers(String value) throws Throwable {
		lp.MobileNumber(value);
		util.pause(3000);
	    
	}

	@When("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
		util.scrolltobottom();
		util.pause(3000);
		lp.SubmitButton();
		util.pause(3000);
		
	}

	@Then("^there shall appear on the places a red highlight where the incorrect data is provided$")
	public void there_shall_appear_on_the_places_a_red_highlight_where_the_incorrect_data_is_provided() throws Throwable {
		colorCode= lp.EmailId().getCssValue("border-bottom-color");
		System.out.println("Color code in RGB" + colorCode);
		expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
		Assert.assertEquals(colorCode, expectedColorCodeInRGB);
		util.pause(3000);
		
		colorCode= lp.MobileNo().getCssValue("border-bottom-color");
		System.out.println("Color code in RGB" + colorCode);
		expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
		Assert.assertEquals(colorCode, expectedColorCodeInRGB);
		util.pause(3000);
	    driver.close();
	}


}
