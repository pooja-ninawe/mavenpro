package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import browser.Pojo;

public class Browserlaunch 
{
 WebDriver driver;

//	 public WebDriver chrombrowser() {
//	     System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
//	   	 driver=new ChromeDriver();
//	   	 driver.get("https://opensource-demo.orangehrmlive.com");
//		
//	   	 
//	   	 
//	   	 return driver;
//	     }

	 public void capturescreenshot(WebDriver driver) throws IOException {
		 
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File dest=new File("D:\\screenshot\\text.jpeg");
		     FileHandler.copy(source, dest);

		}
  public String excel(int row,int cell) throws EncryptedDocumentException, IOException {
	  
	 String path ="C:\\Users\\Admin\\Desktop\\Text1.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		//String s= WorkbookFactory.create(file).getSheet("velocity").getRow(1).getCell(1).getStringCellValue();
		Sheet s=WorkbookFactory.create(file).getSheet("velocity");
				String g =s.getRow(row).getCell(cell).getStringCellValue();
	     System.out.println(g);
    
	     
	     
	     return g;

}


}
