package Testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompackage.dashclas;

public class TestB {
	WebDriver driver;
	
	dashclas dash;
	@BeforeClass
	public void beforeclass() 
	{
		
	System.out.println("beforeclass"); 
	}
	 @BeforeMethod
	public void beforemethod() {
	System.out.println("beforemethod");	
	}
	 @Test
	public void testA() {
		dash=new dashclas(driver);
			dash.desh();
		    dash.lea();
		    dash.tim(); 	
	}
	@Test
	public void testB() {
	System.out.println("testb");	
	}

	@AfterMethod
	public void aftermethod() {
    System.out.println("aftermethod");
	}

	@AfterClass
	public void afterclass() {
	System.out.println("afterclass");	
	}

	}
