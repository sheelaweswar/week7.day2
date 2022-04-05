package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import Base.ProjectSpecificMethods;

public class TC003_EditLead extends ProjectSpecificMethods  {
	@BeforeTest
	public void setData() {
		System.out.println("CreateSetData");
		fileName="tc003";
		System.out.println(fileName);
	}
	
	@Test(dataProvider = "Dynamic_Data")
	public void runTC003(String username, String password , String cname, String phno) throws InterruptedException {
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
		.clickEdit()
		.enterCompanyname(cname)
		.clickUpdate()
		.verifyLeadID();
		
	}

}
