package org.mmp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PatientRegistration {

		WebDriver driver;

		By firstname = By.id("firstname");
		By lastname = By.id("lastname");
		By license = By.id("license");
		By ssn = By.id("ssn");
		By state = By.id("state");
		By city = By.id("city");
		By address = By.id("address");
		By zipcode = By.id("zipcode");
		By age = By.id("age");
		By height = By.id("height");
		By weight = By.id("weight");
		By email = By.id("email");
		By password = By.id("password");
		By username = By.id("username");
		By cpassword = By.cssSelector("#confirmpassword");
		By security = By.cssSelector("#security");
		By answer = By.id("answer");
		By save = By.cssSelector(".login.button>input");
		

		public PatientRegistration(WebDriver driver2){
			driver = driver2;
		}
		// Function to register patient
		public void PatientRegistrationform(String pfname,String plname, String plicense, String pssn,  
				String pstate, String pcity, String paddress, String pzip, String page, String pheight, String pweight, 
				String pemail, String ppwd, String puname, String cpwd, String psecurity, String panswer  ){
						
			driver.findElement(firstname).sendKeys(pfname);
			driver.findElement(lastname).sendKeys(plname);
			driver.findElement(license).sendKeys(plicense);
			driver.findElement(ssn).sendKeys(pssn);
			driver.findElement(state).sendKeys(pstate);
			driver.findElement(city).sendKeys(pcity);
			driver.findElement(address).sendKeys(paddress);
			driver.findElement(zipcode).sendKeys(pzip);
			driver.findElement(age).sendKeys(page);
			driver.findElement(height).sendKeys(pheight);
			driver.findElement(weight).sendKeys(pweight);
			driver.findElement(email).sendKeys(pemail);
			driver.findElement(password).sendKeys(ppwd);
			driver.findElement(username).sendKeys(puname);
			driver.findElement(cpassword).sendKeys(cpwd);
			Select dropdown = new Select(driver.findElement(security));
			dropdown.selectByVisibleText("what is your best friend name");
			driver.findElement(answer).sendKeys(panswer);
			driver.findElement(save).click();
			Alert alert = driver.switchTo().alert();
			alert.getText();
			alert.accept();
		}
}
