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
import PageObjectRepository.VerifyHoveringOver;
import Utility.UtilFile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyHoveringOverTest {
	static WebDriver driver;
	VerifyHoveringOver lp;
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
	
	@Given("^that I am on the Tool Tips page$")
	public void that_I_am_on_the_Tool_Tips_page() throws Throwable {
		driver = BrowserSetup.StartBrowser(prop.getProperty("BrowserType"), prop.getProperty("Url"));
		cdp = new CorrectdataprovisionOnPracticeForm(driver);
		cdp.FormLink();
		util = new UtilFile(driver);
		util.pause(500);
		lp = new VerifyHoveringOver(driver);
		lp.WidgetsLink();
		util.pause(500);
		util.scrolltobottom();
		util.pause(500);
		lp.ToolTips();
	}

	@When("^I hover over the Hover me to see green button$")
	public void i_hover_over_the_Hover_me_to_see_green_button() throws Throwable {
		util.pause(5000);
		util.ToolTipMouseOver(lp.HoverToSee());
		util.pause(5000);
		ActualMessage = lp.TextMessageHoverToSee();
		System.out.println("Actual Message : " + ActualMessage);
		ExpectedMessage= "You hovered over the Button";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		util.pause(3000);
	}
	

	@When("^I hover over the input space Hover me to see$")
	public void i_hover_over_the_input_space_Hover_me_to_see() throws Throwable {
		util.pause(500);
		
		lp = new VerifyHoveringOver(driver);
		lp.WidgetsLink();
		util.pause(500);
		lp.WidgetsLink();
		util.pause(500);
		util.scrolltobottom();
		util.pause(500);
		lp.ToolTips();
		util.pause(5000);
		util.ToolTipMouseOver(lp.toolTipTextField());
		util.pause(5000);
		ActualMessage = lp.TextMessageHoverToSee();
		System.out.println("Actual Message : " + ActualMessage);
		ExpectedMessage= "You hovered over the text field";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		util.pause(3000);
	}

	@Then("^the hover over messages should display$")
	public void the_hover_over_messages_should_display() throws Throwable {
	   driver.close();
	}


}
