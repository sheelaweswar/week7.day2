package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import Base.ProjectSpecificMethods;

public class TC004_DuplicateLead extends ProjectSpecificMethods  {
	@BeforeTest
	public void setData() {
		
		fileName="tc004";
		
	}
	
	@Test(dataProvider = "Dynamic_Data")
	public void runTC004(String username, String password , String phno) throws InterruptedException {
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton_positive()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhone()
		.enterPhone(phno)
		.clickLeadId()
		.clickDuplicate()
		.clickCreateLead();
		
	}


}
