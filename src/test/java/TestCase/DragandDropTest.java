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
import PageObjectRepository.DragandDrop;
import PageObjectRepository.VerifyAlertButton;
import Utility.UtilFile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DragandDropTest {
	static WebDriver driver;
	VerifyAlertButton lp;
	CorrectdataprovisionOnPracticeForm cdop;
	DragandDrop cdp;
	UtilFile util;
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
	
	@Given("^that I am on the Droppable page$")
	public void that_I_am_on_the_Droppable_page() throws Throwable {
		driver = BrowserSetup.StartBrowser(prop.getProperty("BrowserType"), prop.getProperty("Url"));
		cdop = new CorrectdataprovisionOnPracticeForm(driver);
		cdop.FormLink();
		util = new UtilFile(driver);
		util.pause(500);
		util.scrolltobottom();
		util.pause(500);
		cdp = new DragandDrop(driver);
		cdp.InteractionsLinks();
		util.pause(500);
		util.scrolltobottom();
		util.pause(500);
		cdp.Droppable();
		util.pause(500);
	}

	@When("^I drag and drop the Drag me object to the Drop here area$")
	public void i_drag_and_drop_the_Drag_me_object_to_the_Drop_here_area() throws Throwable {
	  util.ActionKeyword(cdp.DragMe(), cdp.DropHere());
	}

	@Then("^the Drop here area shall change into Dropped$")
	public void the_Drop_here_area_shall_change_into_Dropped() throws Throwable {
	   String Dropped = cdp.Dropped();
	   System.out.println("the Drop here area shall change into : " +Dropped);
	}

	@Then("^I verify that on the page that the result is showing as Dropped!$")
	public void i_verify_that_on_the_page_that_the_result_is_showing_as_Dropped() throws Throwable {
		ExpectedMessage= cdp.Dropped();;
		System.out.println("Expected Message : " + ExpectedMessage);
		ActualMessage= "Dropped!";
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		util.pause(3000);
		driver.close();
	}


}
