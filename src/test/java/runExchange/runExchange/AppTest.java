package runExchange.runExchange;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	public static WebDriver driver;
	
    
    public static void main(String[] args) throws Exception
    {
    	
    	String chromeDriverPath="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver";
    	driver=new ChromeDriver();
    	
    	String adminUrl="https://adev.purple25.com/";
    	driver.get(adminUrl);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	String username="//input[@formcontrolname='user_name']";
    	driver.findElement(By.xpath(username)).sendKeys("super");
    	String password="//input[@formcontrolname='password']";
    	driver.findElement(By.xpath(password)).sendKeys("Abcd@123");
    	String submitButton="//button[@type='submit']";
    	driver.findElement(By.xpath(submitButton)).click();
    	//Thread.sleep(5000);
    	List<WebElement> list= driver.findElements(By.tagName("a"));
    	System.out.println(list.size());
    	Actions a =new Actions(driver);
    	WebElement t= driver.findElement(By.xpath("//ul[@class='menu-row']/li[2]"));
    	
    	System.out.println(t.isDisplayed());
    	System.out.println(t.isEnabled());
    	//a.moveToElement(t).click().build().perform();
    	Thread.sleep(10000);
   t.click();
   WebElement addUser=driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/li[2]"));
   addUser.click();
   String clientName1="F"+Math.random()*1000000;
   String trimClientName=clientName1.substring(0,5);
   WebElement clientName =driver.findElement(By.xpath("//input[@formcontrolname='name']"));
  clientName.sendKeys(trimClientName);
  WebElement userName =driver.findElement(By.xpath("//input[@formcontrolname='user_name']"));
  userName.sendKeys(trimClientName);
  WebElement u_password =driver.findElement(By.xpath("//input[@formcontrolname='password']"));
  u_password.sendKeys(trimClientName+"@123");
  WebElement u_domain=driver.findElement(By.xpath("//div[@role='combobox']"));
  u_domain.click();
  WebElement u_Domain_Select=driver.findElement(By.xpath("//div[@role='option']//span[text()='https://futrebook.com']"));
  u_Domain_Select.click();
  WebElement u_credit_reference =driver.findElement(By.xpath("//input[@formcontrolname='credit_reference']"));
  u_credit_reference.sendKeys("10000");
  WebElement u_addUser=driver.findElement(By.xpath("//button[text()='Add user']"));
  u_addUser.click();
  Thread.sleep(3000);
  //Boolean presence=driver.findElement(By.partialLinkText(trimClientName)).isDisplayed();
 // if(presence==true)

  System.out.println(trimClientName+" user created ");
  
  
    	
    	
    }
}
