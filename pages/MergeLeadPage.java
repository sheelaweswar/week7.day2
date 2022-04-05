package com.leaftaps.ui.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods {
	public MergeLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public FromToWindowpage clickFrom() {
		driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
		return new FromToWindowpage(driver);

	}
	public FromToWindowpage clickTo() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		return new FromToWindowpage(driver);
	}
	public ViewLeadPage clickMerge() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String title2 = driver.getTitle();
		System.out.println(title2);
		return new ViewLeadPage(driver);
	}

}
