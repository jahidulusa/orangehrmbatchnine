package com.stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageFactory.LoginPageOrange;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	
	LoginPageOrange lp;
	
	@Given("^user open web browser and navigate to HRM login screen a$")
	public void user_open_web_browser_and_navigate_to_HRM_login_screen_a() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		lp = PageFactory.initElements(driver, LoginPageOrange.class);
	    
	}

	@Then("^user Navigate to Page and verify the Page Title is \"([^\"]*)\" a$")
	public void user_Navigate_to_Page_and_verify_the_Page_Title_is_a(String arg1) throws Throwable {
	    String actual = driver.getTitle();
	    String expected = "OrangeHRM";
	    Assert.assertTrue("The titel is wrong", actual.contains(expected));
	    
	    	}

	@Then("^user enter a valid username and password a$")
	public void user_enter_a_valid_username_and_password_a() throws Throwable {
	 
	    
	    lp.getUsername().sendKeys("Admin");
	    lp.getPassword().sendKeys("admin123");
	    
	}

	@Then("^user click the Sign in button a$")
	public void user_click_the_Sign_in_button_a() throws Throwable {
	    Assert.assertTrue(2==4);
	    
	}

	@When("^user click on log out button for Orange Hrm a$")
	public void user_click_on_log_out_button_for_Orange_Hrm_a() throws Throwable {
	    
	    
	}
}
