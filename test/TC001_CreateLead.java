package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import Base.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		System.out.println("CreateSetData");
		fileName="tc001";
		System.out.println(fileName);
	}
	
	@Test(dataProvider = "Dynamic_Data")
	public void runTC001(String username, String password , String companyName, String firstName, String lastName) {
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton_positive()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickcreateLeadButton()
		.verifyLeadID();
		
		
		/*
		 * LoginPage page = new LoginPage(); LoginPage enterUsername =
		 * page.enterUsername(username); LoginPage enterPassword =
		 * page.enterPassword(password); WelcomePage clickLoginButton_positive =
		 * page.clickLoginButton_positive();
		 * 
		 * WelcomePage page1 = new WelcomePage(); page1.clickCRMSFA();
		 */
	}
}
