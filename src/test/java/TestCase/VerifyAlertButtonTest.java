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
import PageObjectRepository.VerifyAlertButton;
import Utility.UtilFile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyAlertButtonTest {
	static WebDriver driver;
	VerifyAlertButton lp;
	CorrectdataprovisionOnPracticeForm cdp;
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
	
	@Given("^that I am on the Alerts page$")
	public void that_I_am_on_the_Alerts_page() throws Throwable {
		driver = BrowserSetup.StartBrowser(prop.getProperty("BrowserType"), prop.getProperty("Url"));
		cdp = new CorrectdataprovisionOnPracticeForm(driver);
		cdp.FormLink();
		util = new UtilFile(driver);
		util.pause(500);
		lp = new VerifyAlertButton(driver);
		lp.AlertFrameWindow();
		util = new UtilFile(driver);
		util.pause(500);
		lp.AlertWindow();
		util.pause(500);
	   
	}

	@When("^I click On the second button$")
	public void i_click_On_the_second_button() throws Throwable {
		lp.timerAlertButton();
		util.pause(500);
	   
	}

	@Then("^after five seconds a message shall appear This alert appeared after five seconds$")
	public void after_five_seconds_a_message_shall_appear_This_alert_appeared_after_five_seconds() throws Throwable {
		util.pause(10000);
		alert = driver.switchTo().alert();
		System.out.println("Alert message captured : " + alert.getText());
		Assert.assertEquals("This alert appeared after 5 seconds", alert.getText());
		util.pause(1000);
		
	   
	}

	@Then("^I click Ok$")
	public void i_click_Ok() throws Throwable {
		util.pause(1000);
		alert.accept();
		System.out.println("Clicked on Ok button");
		util.pause(1000);
	    driver.close();
	}


}
