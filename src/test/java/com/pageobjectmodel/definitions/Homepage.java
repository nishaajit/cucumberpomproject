package com.pageobjectmodel.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
        this.driver = driver;
 
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	public String getTitleOfTheHomePage() {
		String title=getTitleOfTheHomePage();
		System.out.println("title of the page"+title);
		return title;

}
}