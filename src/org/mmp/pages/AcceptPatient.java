package org.mmp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AcceptPatient {
WebDriver driver;

By users = By.xpath("html/body/div[1]/div/div[1]/div/ul/li[3]/a");
By status = By.xpath(".//*[@id='search']");
//By patientname = By.xpath(".//*[@id='show']/table/tbody/tr[175]/td[1]");
By patientname = By.cssSelector("#show table tr:nth-child(174) a");
By pstatus = By.xpath(".//*[@id='sapproval']");
By submit = By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/form/div/table/tbody/tr[13]/td/input");

public AcceptPatient(WebDriver driver){
	this.driver = driver;
}

public void clicktoAcceptPatient(){
	driver.findElement(users).click();
}

public void searchPatientbyStatus() throws InterruptedException{
	Select statusdropdown = new Select(driver.findElement(status));
	statusdropdown.selectByVisibleText("Pending");
	Thread.sleep(500);
	
}

public void acceptPendingPatient() throws InterruptedException{
	driver.findElement(patientname).click();
	Select dropdown = new Select(driver.findElement(pstatus));
	dropdown.selectByVisibleText("Pending");
	driver.findElement(submit).click();
	Alert alert = driver.switchTo().alert();
	String message = alert.getText();
	System.out.println(message);
	alert.accept();
}

}
