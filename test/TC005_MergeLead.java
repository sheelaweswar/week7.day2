package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import Base.ProjectSpecificMethods;

public class TC005_MergeLead extends ProjectSpecificMethods  {
	@BeforeTest
	public void setData() {
		System.out.println("CreateSetData");
		fileName="tc005";
		System.out.println(fileName);
	}
	
	@Test(dataProvider = "Dynamic_Data")
	public void runTC005(String username, String password, String fname, String fname1) throws InterruptedException {
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton_positive()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickFrom()
		.clickFirstLead(fname)
		.clickTo()
		.clickSecondLead(fname1)
		.clickMerge()
		.verifyLeadID();
	}

}
