package stepdefinitions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class DigiboxStepdefinition{
	
	WebDriver driver = null;
	@Given("^User is on google chrome$")
	public void user_is_on_google_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumComponents/chromedriver.exe");
		String ProjectPath = System.getProperty("user.dir");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@And("^User navigates to login page$")
    public void user_navigates_to_login_page() throws Throwable {
		driver.navigate().to("https://apptest.digiboxx.com/login");
    }
	@Then("^User enters valid Digispace and Email and Password$")
	public void user_enters_valid_digispace_and_email_and_password() throws Throwable {
		driver.findElement(By.id("workspace")).sendKeys("Freeuse");
		driver.findElement(By.id("Username")).sendKeys("freeuser251093@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gaurav@123");
	}

	@And("^User presses login button$")
	public void user_presses_login_button() throws Throwable {
		WebElement LoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login Now')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", LoginButton);
	}
	
	@Then("^User clicks click here$")
    public void user_clicks_click_here() throws Throwable {
		WebElement ClickHere = driver.findElement(By.linkText("Click Here"));
		JavascriptExecutor p = (JavascriptExecutor)driver;
		p.executeScript("arguments[0].click()", ClickHere);
    }
	@And("^User creates a folder$")
    public void user_creates_a_folder() throws Throwable {
		driver.findElement(By.xpath("//*[@class='add-btn']")).click();
		driver.findElement(By.xpath("//*[@class='text-box-wrap add-new-folder']")).click();
		driver.findElement(By.id("folderName")).sendKeys("Swati");
		driver.findElement(By.xpath("//*[@class='start-btn log-btn my-1']")).click();
    }
	@Then("^User clicks add button and selects upload file from dropdown menu$")
    public void user_clicks_add_button_and_selects_upload_file_from_dropdown_menu() throws Throwable {
		driver.findElement(By.xpath("//*[@class='folder-box null ng-star-inserted']")).click();
		driver.findElement(By.xpath("//*[@class='add-btn']")).click();
		driver.findElement(By.xpath("(//*[@class='text-box-wrap'])[1]")).click();
		  	Robot rb = new Robot();
		    StringSelection str = new StringSelection("C:\\Users\\thora\\Desktop\\Python\\myfile.txt");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		    rb.keyPress(KeyEvent.VK_CONTROL);
		    rb.keyPress(KeyEvent.VK_V);
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
    }
}






