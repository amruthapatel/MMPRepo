package org.mmp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientLogin {
WebDriver driver;

By patientusername = By.xpath(".//*[@id='username']");
By patientpassword = By.xpath(".//*[@id='password']");
By patientsignin = By.xpath(".//*[@id='login']/form/p[6]/input");

public PatientLogin(WebDriver driver){
	this.driver = driver;

}

// Function for Patient Login

public void logintoPatient(String uname, String pwd){
	
	driver.findElement(By.cssSelector("#username")).sendKeys(uname);
	driver.findElement(patientpassword).sendKeys(pwd);
	driver.findElement(patientsignin).click();
}

}
