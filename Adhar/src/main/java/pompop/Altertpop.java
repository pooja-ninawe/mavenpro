package pompop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Altertpop 
{
	WebDriver driver;
@FindBy(xpath="//input[@name='submit'] ")
private WebElement submit;

public Altertpop(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void subbutton()
{
  submit.click(); 	
}
public void alt(){

	Alert alte=driver.switchTo().alert();
      alte.accept();

}


}
