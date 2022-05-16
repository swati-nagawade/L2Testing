package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QaMaxTestcase {
	@Test(priority=1)
	public void LoginTest() throws InterruptedException{
		
		 System.out.println("I am inside LoginTest");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qa.max.com/login/");
		 driver.findElement(By.id("myusername")).sendKeys("11103");
		 Thread.sleep(2000);
		 driver.findElement(By.id("mypassword")).sendKeys("Cheese456!");
		 Thread.sleep(2000);
		 driver.findElement(By.id("submit")).click();
		 Thread.sleep(2000);
		 driver.close();
		 System.out.println("LoginTest successfull");
		
	}
	@Test(priority=2)
	public void HomepageOptions() throws InterruptedException {
		
		System.out.println("I am inside HomepageOptions test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.max.com/home/");
		driver.findElement(By.id("countries")).click();
		Select s = new Select(driver.findElement(By.id("countries")));	
		Thread.sleep(2000);
		s.selectByValue("US");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		Thread.sleep(2000);
		driver.close();
}
	@Test(priority = 3)
	public void CheckoutItems() throws InterruptedException {
		
		System.out.println("I am inside CheckoutItems test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.max.com/home/");
		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Beauty")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[25]/div[1]/div[3]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/div[2]/ul[1]/a[1]/div[2]/img[1]")).click();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Test succefull");
	}
}
