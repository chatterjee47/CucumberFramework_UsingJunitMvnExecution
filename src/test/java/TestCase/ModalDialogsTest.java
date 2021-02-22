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
import PageObjectRepository.ModalDialogs;
import Utility.UtilFile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ModalDialogsTest {
	static WebDriver driver;
	CorrectdataprovisionOnPracticeForm cdp;
	ModalDialogs lp;
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
	
	@Given("^that I am on the Modal Dialogs page$")
	public void that_I_am_on_the_Modal_Dialogs_page() throws Throwable {
		driver = BrowserSetup.StartBrowser(prop.getProperty("BrowserType"), prop.getProperty("Url"));
		cdp = new CorrectdataprovisionOnPracticeForm(driver);
		cdp.FormLink();
		util = new UtilFile(driver);
		util.pause(500);
		lp = new ModalDialogs(driver);
		lp.AlertFrameWindow();
		util = new UtilFile(driver);
		util.pause(500);
		util.scrolltobottom();
		util.pause(500);
		lp.ModalDialog();
		util.pause(500);
	}

	@Given("^I click on the Small modal button$")
	public void i_click_on_the_Small_modal_button() throws Throwable {
		lp.SmallModal();
		util.pause(500);
	}

	@When("^the Small modal appears and I press Close$")
	public void the_Small_modal_appears_and_I_press_Close() throws Throwable {
		lp.closeSmallModal();
		util.pause(500);
	}

	@Then("^the small modal should get closed$")
	public void the_small_modal_should_get_closed() throws Throwable {
	driver.close();
	}


}
