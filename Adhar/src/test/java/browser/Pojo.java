package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Browserlaunch;

public class Pojo extends Browserlaunch

{
WebDriver driver;
	public WebDriver rowser() {
	     System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	   	 driver=new ChromeDriver();
	   	 driver.get("https://opensource-demo.orangehrmlive.com");
		
	   	 
	   	 
	   	 return driver;
	     }







}
