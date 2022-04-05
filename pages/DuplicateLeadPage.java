package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
	public DuplicateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public DuplicateLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
}
