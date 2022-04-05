package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public EditLeadPage enterCompanyname(String cname) {
		WebElement compname = driver.findElement(By.id("updateLeadForm_companyName"));
		compname.clear();
		compname.sendKeys(cname);
		return this;
		}
	public ViewLeadPage clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
