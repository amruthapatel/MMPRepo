package org.mmp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickPatientRegistration {
WebDriver driver;

public ClickPatientRegistration(WebDriver driver2){
	driver = driver2;
}

public void clickPatientRegistration(){
	driver.findElement(By.cssSelector(".navbar-right li:nth-child(2) a")).click();
	driver.findElement(By.xpath(".//*[@id='testimonials']/div/div/div/div[3]/a")).click();
}


}
