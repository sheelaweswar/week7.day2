package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{
	public FindLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public FindLeadPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
		
	}
	public FindLeadPage enterPhone(String phno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		return this;
		
	}
	public FindLeadPage clickFind() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public ViewLeadPage clickLeadId() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
		
	}
    
    public FindLeadPage enterLeadID() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
    public FindLeadPage verifyDeleteButton() {
    	String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return this;
    	
    }

}
