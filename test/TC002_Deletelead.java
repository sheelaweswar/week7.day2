package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import Base.ProjectSpecificMethods;

public class TC002_Deletelead extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		fileName="tc002";
	}
	@Test(dataProvider = "Dynamic_Data")
	public void runTC002(String username, String password, String phno) throws InterruptedException {
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton_positive()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhone()
		.enterPhone(phno)
		.clickFind()
		.clickLeadId()
		.clickDelete()
		.clickFindLead()
		.enterLeadID()
		.clickFind()
		.verifyDeleteButton();
		
	}
	
}
