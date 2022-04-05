package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import Base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public CreateLeadPage enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public CreateLeadPage enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public CreateLeadPage enterPhoneNum(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;
	}
	public ViewLeadPage clickcreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
