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
import PageObjectRepository.CorrectdataprovisionOnPracticeForm;
import Utility.UtilFile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorrectdataprovisionOnPracticeFormTest {
	static WebDriver driver;
	CorrectdataprovisionOnPracticeForm lp;
	UtilFile util;
	Alert alert;
	static Properties prop;
	static FileInputStream fileInput;
	static File file = new File(System.getProperty("user.dir") + "\\config\\file.properties");
	static String ExpectedMessage;
	static String ActualMessage;
	static String fileupload = System.getProperty("user.dir") + "\\data\\sample png file.PNG";
	
	String firstName,lastName,EmailAddress,Gender,MobileNumber,ValidDateOfBirth,Subjects,Hobbies_Sports,Hobbies_Reading,UploadPicture,CurrentAddress,City,State;
	
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
	
	
	@Given("^that I go to the Practice Form page$")
	public void that_I_go_to_the_Practice_Form_page() throws Throwable {
		driver = BrowserSetup.StartBrowser(prop.getProperty("BrowserType"), prop.getProperty("Url"));
		lp = new CorrectdataprovisionOnPracticeForm(driver);
		lp.FormLink();
		util = new UtilFile(driver);
		util.pause(500);
		lp.PracticeForm();
		util.pause(500);
	   
	}

	@When("^I type in Name \"([^\"]*)\"$")
	public void i_type_in_Name(String value) throws Throwable {
		lp.firstName(value);
		util.pause(500); 
	}

	@When("^I typed Last Name \"([^\"]*)\"$")
	public void i_typed_Last_Name(String value) throws Throwable {
		lp.lastName(value);
		util.pause(500);
	}

	@When("^I type in Email \"([^\"]*)\"$")
	public void i_type_in_Email(String value) throws Throwable {
		lp.EmailAddress(value);
		util.pause(500);
	}

	@When("^I select Gender as Male$")
	public void i_select_Gender_as_Male() throws Throwable {
	    
		lp.Gender();
		util.pause(500);
	}

	@When("^I type in mobile \"([^\"]*)\"$")
	public void i_type_in_mobile(String value) throws Throwable {
		lp.MobileNumber(value);
		util.pause(500);
	}

	@When("^I select from the calendar date of birth$")
	public void i_select_from_the_calendar_date_of_birth() throws Throwable {
		lp.DateOfBirth();
		util.pause(500);
		lp.SelectDropdown(lp.MonthDropdown,"January");
		util.pause(500);
		lp.SelectDropdown(lp.YearDropdown,"1991");
		util.pause(500);
		lp.DateSelection();
		util.pause(500);
	}

	@When("^I type in Subjects \"([^\"]*)\"$")
	public void i_type_in_Subjects(String value) throws Throwable {
		util.pause(500);
		lp.Subjects(value);
		util.pause(500);
	}

	@When("^I select Hobbies Sports$")
	public void i_select_Hobbies_Sports() throws Throwable {
		lp.Hobbies_Sports();
		util.pause(500);
	}

	@When("^I select Hobbies Reading$")
	public void i_select_Hobbies_Reading() throws Throwable {
		lp.Hobbies_Reading();
		util.pause(500);
	}

	@When("^I upload a png file$")
	public void i_upload_a_png_file() throws Throwable {
		util.pause(1000);
		lp.UploadPicture(fileupload);
		System.out.println("File is Uploaded Successfully");
		util.pause(1000);
	}

	@When("^I type in Current Adress \"([^\"]*)\"$")
	public void i_type_in_Current_Adress(String value) throws Throwable {
		util.pause(1000);
		lp.CurrentAddress(value);
	   util.scrolltobottom();
	   util.pause(1000);
	}

	@When("^I select NCR as state$")
	public void i_select_NCR_as_state() throws Throwable {
		util.pause(1000);
		lp.State();
		util.pause(1000);
		util.ValidateDropdown("NCR");
	}

	@When("^I select Noida as city$")
	public void i_select_Noida_as_city() throws Throwable {
		util.pause(1000);
		lp.City();
		util.pause(1000);
		util.ValidateDropdown("Noida");
	}

	@When("^I click Submit button$")
	public void i_click_Submit_button() throws Throwable {
	    
		util.pause(1000);
		lp.SubmitButton();
	}

	@Then("^there shall appear a message Thanks for submitting the form$")
	public void there_shall_appear_a_message_Thanks_for_submitting_the_form() throws Throwable {
		ExpectedMessage= lp.SuccessfulMessage();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "Thanks for submitting the form";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	   
	}

	@Then("^I verify on the result view that Student name matches with the provided name$")
	public void i_verify_on_the_result_view_that_Student_name_matches_with_the_provided_name() throws Throwable {
		ExpectedMessage= lp.StudentName();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "Amit Chatterjee";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	   
	}

	@Then("^I verify on the result view email matches with the provided email$")
	public void i_verify_on_the_result_view_email_matches_with_the_provided_email() throws Throwable {
		ExpectedMessage= lp.StudentEmail();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "ssl-27@hotmail.com";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	   
	}

	@Then("^I verify on the result view Gender matches with the provided data$")
	public void i_verify_on_the_result_view_Gender_matches_with_the_provided_data() throws Throwable {
		ExpectedMessage= lp.GenderDisplay();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "Male";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	   
	}

	@Then("^I verify on the result view Mobile name matches with the provided number$")
	public void i_verify_on_the_result_view_Mobile_name_matches_with_the_provided_number() throws Throwable {
		ExpectedMessage= lp.VerifyMobileNo();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "0742449993";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	   
	}

	@Then("^I verify on the result view Date of birth name matches with the provided date$")
	public void i_verify_on_the_result_view_Date_of_birth_name_matches_with_the_provided_date() throws Throwable {
		ExpectedMessage= lp.verifyDateOfBirth();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "01 January,1991";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	   
	}

	@Then("^I verify on the result view Subjects matches with the provided data$")
	public void i_verify_on_the_result_view_Subjects_matches_with_the_provided_data() throws Throwable {
		ExpectedMessage= lp.VerifySubjects();
		if(ExpectedMessage.isEmpty()){
			System.out.println("Suject doesnot have data");
		}else{
			System.out.println("Suject have data");
		}
		util.pause(3000);
	   
	}

	@Then("^I verify on the result view Hobbies matches with the provided data$")
	public void i_verify_on_the_result_view_Hobbies_matches_with_the_provided_data() throws Throwable {
		ExpectedMessage= lp.VerifyHobbies();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "Sports, Reading";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	   
	}

	@Then("^I verify on the result view Uploaded png name matches with the provided png name$")
	public void i_verify_on_the_result_view_Uploaded_png_name_matches_with_the_provided_png_name() throws Throwable {
		ExpectedMessage= lp.VerifyPicture();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "sample png file.PNG";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	   
	}

	@Then("^I verify on the result view Address matches with the provided address$")
	public void i_verify_on_the_result_view_Address_matches_with_the_provided_address() throws Throwable {
	    
		ExpectedMessage= lp.VerifyAddress();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "Hydearbad";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	}

	@Then("^I verify on the result view State matches with the provided state name$")
	public void i_verify_on_the_result_view_State_matches_with_the_provided_state_name() throws Throwable {
	    
		ExpectedMessage= lp.VerifyStateCity();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "NCR Noida";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	}

	@Then("^I verify on the result view City matches with the provided city name$")
	public void i_verify_on_the_result_view_City_matches_with_the_provided_city_name() throws Throwable {
		ExpectedMessage= lp.VerifyStateCity();
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "NCR Noida";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
	}

	@Then("^I click close$")
	public void i_click_close() throws Throwable {
		lp.CloseButton();
		driver.close();
	}


}
