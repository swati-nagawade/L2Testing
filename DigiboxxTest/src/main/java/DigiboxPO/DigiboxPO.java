package DigiboxPO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DigiboxPO {
	WebDriver driver = null;
	public void NavigateToWeb() {
		driver.navigate().to("https://apptest.digiboxx.com/login");	
	}
	public void EnterDigispace() {
		driver.findElement(By.id("workspace")).sendKeys("Freeuse");	
	}
	public void EnterEmail() {
		driver.findElement(By.id("Username")).sendKeys("freeuser251093@gmail.com");
	}
    public void EnterPassword() {
    	driver.findElement(By.id("Password")).sendKeys("Gaurav@123");
    }
    public void PressLoginButton() {
    	WebElement LoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login Now')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", LoginButton);
    }
    public void UserClicksClickHere() {
		WebElement ClickHere = driver.findElement(By.linkText("Click Here"));
		JavascriptExecutor p = (JavascriptExecutor)driver;
		p.executeScript("arguments[0].click()", ClickHere);
    }
    public void UserUploadsFiles() {
		driver.findElement(By.xpath("//*[@class='add-btn']")).click();
		driver.findElement(By.xpath("//div[@class='ng-star-inserted'])[1]")).sendKeys("C:\\Users\\thora\\Desktop\\FBTestCase.xlsx\\");
    }
}