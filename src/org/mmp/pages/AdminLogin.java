package org.mmp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminLogin {
	WebDriver driver;
	
	By adminusername = By.cssSelector("#username");
	By adminpassword = By.cssSelector("#password");
	By adminSignin = By.cssSelector(".login.button>input");
	
	public AdminLogin(WebDriver driver){
		this.driver=driver;
	}
	
	public void logintoAdmin(String uname, String pwd){
		driver.findElement(By.cssSelector("#username")).sendKeys(uname);
		driver.findElement(adminpassword).sendKeys(pwd);
		driver.findElement(adminSignin).click();
	}
	

}
