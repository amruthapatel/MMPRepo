package org.mmp.tests;

import org.mmp.pages.AcceptPatient;
import org.mmp.pages.AdminLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyPatientLogin {

	WebDriver driver;
	//String adminurl = "http://96.84.175.78/MMP-Release2-Admin-Build.2.1.000/login.php";
	String homepage = "http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000";
	String patientreg = "http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/registration.php";
	
	@Parameters({"browserType", "adminurl"})
	@BeforeClass
	public void setUp(String browserType, String adminurl)
	{
		 System.out.println("Browser: " + browserType);
		if(browserType.equals("FF")){
			driver = new FirefoxDriver();
		}else if(browserType.equals("IE")){
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}else{
			
			System.setProperty("webdriver.chrome.driver", "Chromedriverserver.exe");
			driver=new ChromeDriver();
		}

		driver.get(adminurl);

	}
	// Patient Registration Values passed
		/*@Test 
		public void verifyPatientReg(){
			PatientRegistration preg = new PatientRegistration(driver);
			preg.PatientRegistrationform("Tornado", "batch", "12345678", "123000089", "CA", "city",
					"Funnyway", "87679", "30", "55", "65", "tornado@h2k.com", "Tornado1", "tornado1", 
					"Tornado1", "what is your best friend name", "friend");
			
			driver.navigate().to("http://96.84.175.78/MMP-Release2-Admin-Build.2.1.000/login.php");
	*/
	/*@Test
	public void verifyPatientLogin(){
		HomePage hpage = new HomePage(driver);
		hpage.clickPatientLogin();
		PatientLogin plogin = new PatientLogin(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("before login function"); 
		plogin.logintoPatient("selenium", "Selenium123");

	}*/
	
	@Test
	public void logintoAdmin(){
		AdminLogin alogin = new AdminLogin(driver);
		alogin.logintoAdmin("begum", "1Loveusa");
		}
	
	@Test
	public void searchPendingtoAccept() throws InterruptedException{
		AcceptPatient acceptpatient = new AcceptPatient(driver);
		acceptpatient.clicktoAcceptPatient();
		acceptpatient.searchPatientbyStatus();
		acceptpatient.acceptPendingPatient();
				
	}
	
		}
	/*@AfterClass
	public void closeBrowser(){
		driver.quit();
	}*/
	


