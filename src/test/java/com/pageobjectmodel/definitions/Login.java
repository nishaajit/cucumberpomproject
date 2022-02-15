package com.pageobjectmodel.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	 WebDriver driver;
	 
	 @FindBy(id="username")
	 WebElement usrname;
	 @FindBy (id ="password")
	 WebElement psword;
	 @FindBy (xpath =" //input[@id='Login']")
	 WebElement button;
	 @FindBy (id = "rememberUn")
	 WebElement box;
	 
	 public Login (WebDriver driver ) {
		 this.driver = driver;
		 
	        // This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
		  }
	 // Set user name in textbox
	    public void setUserName(String strUserName) {
	        usrname.sendKeys(strUserName);
	    }
	 
	    // Set password in password textbox
	    public void setPassword(String strPassword) {
	        psword.sendKeys(strPassword);
	    }
	 
	     // check remember me box
	     public void checkrememberme () {
	    	 box.click();
	     }
	    
	    
	    
	    // Click on login button
	    public void clickLogin() {
	        button.click();
	    }
	 
	    
	 
	    public void login(String strUserName, String strPassword) {
	 
	        // Fill user name
	        this.setUserName(strUserName);
	 
	        // Fill password
	        this.setPassword(strPassword);
	 
	        // Click Login button
	        this.clickLogin();
	 
	    }
	    public void checkbox (){
	    	this.checkrememberme();
	    }
	    
	
}
