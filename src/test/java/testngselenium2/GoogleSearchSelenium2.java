package testngselenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchSelenium2 {
    WebDriver driver;
  
    @BeforeClass
    @Parameters({"Browser"})
    public void setUp(String driverType){
    		switch (driverType) {
			case "chrome":
	    			System.setProperty("webdriver.chrome.driver",
	    					"/Users/murodilruz/Documents/Libraries/drivers/chromedriver");
	    			driver=new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver",
    					"/Users/murodilruz/Documents/Libraries/drivers/geckodriver");
    				driver=new FirefoxDriver();
    				break;
			default:
				break;
			}
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		
    }
    
    
  @Test
  public void googleSearch() {
	  driver.get("https://www.google.com/");
	  driver.findElement(By.id("lst-ib")).sendKeys("Selenium jobs"+Keys.ENTER);
	  WebElement results=driver.findElement(By.id("resultStats"));
	  System.out.println(results.getText());
	  
  }
  
  @AfterClass
  public void tearDown(){
	  driver.quit();
  }
  
}
