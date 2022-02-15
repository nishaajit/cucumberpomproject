package com.pageobjectmodel.definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginpageDefinitions {
	
	WebDriver driver;
	Login objLogin;
	 
    Homepage objHomePage;
 
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Given("user is on the Login page")
	public void user_is_on_the_login_page() {
		// Create Login Page object
        objLogin = new Login(driver);
		driver.get("https://tekarch-b6-dev-ed.my.salesforce.com/");
	}



	@When("user entersusername as {string} and password as {string}")
	public void user_entersusername_as_and_password_as(String strUserName , String strPassword) {
	   objLogin.login(strUserName, strPassword);
	}

 

	
	@When("user click on login button")
	public void user_click_on_login_button() {
	   objLogin.clickLogin();
	}
	@When("user check the remember me box")
	public void user_check_the_remember_me_box() {
	    objLogin.checkrememberme();
	}
     
 

	@Then("verify page title {string}")
	public void verify_page_title(String expectedString) {
		String actual=driver.getTitle();
		System.out.println("extracted title is="+actual);
	//	Assert.assertEquals(actual, expectedString);
	}
	
	
	 @After
	    public void close() {
	 
	        // Close the browser
	        driver.close();
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	

}
