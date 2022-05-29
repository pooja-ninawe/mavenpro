package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	WebDriver driver;
	//WebDriverWait wait;
	 @FindBy(xpath="//input[@name='txtUsername']")
	private WebElement UserName;

	 @FindBy(xpath="//input[@name='txtPassword']")
	private WebElement Password;

	 @FindBy(xpath="//input[@name='Submit']")
	private WebElement SubmitButton;

     

	 public  Loginpage (WebDriver driver) 
	 {
	   
	   this.driver=driver;
	  // this.wait=wait;
	   PageFactory.initElements(driver,this);
		
	}
	public  void sendUserName(String g) {
		//UserName.sendKeys("Admin");
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtUsername']")));
 //UserName.sendKeys(UN);
		UserName.sendKeys(g);
	}
	public void password( String g) {
		Password.sendKeys(g);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtPassword']")));	
	  
	}
	public void submit() {
		SubmitButton.click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Submit']")));
	}
	



















}
