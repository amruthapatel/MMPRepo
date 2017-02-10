package org.mmp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
WebDriver driver;

public HomePage(WebDriver driver){
	this.driver=driver;
}
public void clickPatientLogin(){
	System.out.println(driver); 
	
	driver.findElement(By.xpath(".//*[@id='navigation']/li[2]/a")).click();
	WebElement e1 =driver.findElement(By.cssSelector(".button.button-alt"));
	e1.sendKeys(Keys.ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*List<WebElement> e1 =driver.findElements(By.cssSelector(".button.button-alt"));
	((WebElement) e1).sendKeys(Keys.ENTER);*/
	/*System.out.println(e1.size());
	
	e1.get(0).click();*/
	
	//.button.button-alt
	/*WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='testimonials']//div[2]/a")));
	if(e.isDisplayed()){
		System.out.println("in if");
		e.click();
		
	}*/
	
}

/*public void clickToOpen() {
	System.out.println("inside");
	driver.findElement(By.cssSelector(".container .row .col-md-4:nth-child(2) a.button-alt")).click();
	System.out.println("inside 2");
}*/
}

