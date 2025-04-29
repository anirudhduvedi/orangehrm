package Logintestjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_orange {

	WebDriver driver = new ChromeDriver();
		
	@Test (priority = 1)
	public void login() throws InterruptedException {
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		login.click();
		Thread.sleep(2000);
	}
	
		@Test (priority = 2)
		public void addemployee() throws InterruptedException {
		WebElement pimMenu = driver.findElement(By.xpath("//span[text()='PIM']"));
		pimMenu.click();
		Thread.sleep(2000);
		
		WebElement addEmployeeLink = driver.findElement(By.linkText("Add Employee"));
		addEmployeeLink.click();
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("Rohan");
	    Thread.sleep(1000);
	 
	   WebElement lname = driver.findElement(By.name("lastName"));
	   lname.sendKeys("Sharma");
	   Thread.sleep(2000);
	 
	   List<WebElement> inputField = driver.findElements(By.cssSelector("input.oxd-input.oxd-input--active"));
	   for (int i = 0; i < 4; i++) {
	   inputField.get(inputField.size() - 1).sendKeys(Keys.BACK_SPACE); 
	   }
	   Thread.sleep(2000);
	   
	   inputField.get(inputField.size() - 1).sendKeys("9982");
       Thread.sleep(2000);
	   
	   WebElement saveinfo = driver.findElement(By.xpath("//button[@type='submit']"));
	   saveinfo.click();
	   Thread.sleep(8000);
		
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0, 600);");
	   
	   WebElement saveButton = driver.findElement(By.xpath("//button[text()=' Save ']"));
	   saveButton.click();
	   Thread.sleep(6000);
	   
	}
	   @Test (priority = 3)
	   public void searchemp() throws InterruptedException {
	   WebElement employeeListLink = driver.findElement(By.linkText("Employee List"));
	   employeeListLink.click();
	   Thread.sleep(2000);
	   
	   WebElement hintInput = driver.findElement(By.cssSelector("input[placeholder='Type for hints...']"));
	   hintInput.sendKeys("Rohan Sharma");
	   Thread.sleep(2000);
	   
	   List<WebElement> inputid = driver.findElements(By.cssSelector("input.oxd-input.oxd-input--active"));
	   inputid.get(inputid.size() - 1).sendKeys("9982");
	   Thread.sleep(2000);
	   
	   WebElement searchButton = driver.findElement(By.xpath("//button[normalize-space()='Search']"));
	   searchButton.click();
	   Thread.sleep(2000);
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0, 350);");
  }
	   
	   @Test (priority = 4)
	  public void logout() throws InterruptedException {
		   
		   WebElement profiledropdown = driver.findElement(By.className("oxd-userdropdown-name"));
		   profiledropdown.click();
		   Thread.sleep(2000);
		   
		   WebElement logout = driver.findElement(By.linkText("Logout"));
		   logout.click();
		   driver.close();
	   }
	   
}
