package Testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.Pojo;
import pompackage.Loginpage;
import pompackage.dashclas;

import utility.Browserlaunch;
public class TestA extends Pojo {
   Loginpage log;
	WebDriver driver;
	dashclas dash;
 @BeforeClass
public void beforeclass() throws IOException 
{
	//driver=chrombrowser();
    // capturescreenshot(driver);
 driver=rowser();
}
 @BeforeMethod
public void beforemethod() {

	 //System.out.println("BEFOREMETHOD");
}
 @Test
public void testA() throws EncryptedDocumentException, IOException {
	 
	 log = new Loginpage(driver);
	 
	 log.sendUserName(excel(1,0));
	  log.password(excel(1,1));
	  log.submit();
	 // String Actualurl=driver.getCurrentUrl();
	 // String Expected="https://opensource-demo.orangehrmlive.com";
	 //	  Assert.assertEquals(Actualurl, Expected);
  	    
 }
//@Test
//public void testB() {
////	dash=new dashclas(driver);
//	dash.desh();
//    dash.lea();
//    dash.tim(); 
//    dash.requre();

//}

@AfterMethod
public void aftermethod() {
//	dash=new dashclas(driver);
//	dash.desh();
}

@AfterClass
public void afterclass() {
System.out.println("afterclass");	
}
}

