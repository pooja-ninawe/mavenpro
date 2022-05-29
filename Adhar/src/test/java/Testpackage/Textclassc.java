package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompop.Altertpop;

public class Textclassc 
{
 WebDriver driver;
 Altertpop altet;
@BeforeClass

public void beforeclass()
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	    
	
}
@BeforeMethod
public void beforemethod() {

	
}
@Test
public void testA() {
	 altet=new Altertpop(driver); 
     
     altet.subbutton();
     altet.alt();
}
@AfterMethod
public void aftermethod() {
	
}
@AfterClass
public void aferclass()
{
	
}













}
