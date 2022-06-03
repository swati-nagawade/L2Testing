package Digiboxautomation;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class createfolder {
    static AndroidDriver driver;
	public static void main(String[] args) {
		try {
			openDigiboxx();
		}catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
	}
}
	@Test(priority=0)
	private static void openDigiboxx() throws Exception{
		DesiredCapabilities cap = new DesiredCapabilities(); 
		cap.setCapability("deviceName", "Pixel 4 API 30");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.liqvd.digibox.test");
		cap.setCapability("appActivity", "com.liqvd.digibox.ui.MainActivityNew");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		System.out.println("Succefully runned");
	}
	@Test(priority=1)
	public void LoginIntoDigibox() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.id("com.liqvd.digibox.test:id/btnSkipIntroSlideOne")).click();
		driver.findElement(By.id("com.liqvd.digibox.test:id/edtDigiSpaceName")).sendKeys("Freeuse");
		driver.findElement(By.id("com.liqvd.digibox.test:id/edtEmail")).sendKeys("freeuser251093@gmail.com");
		driver.findElement(By.id("com.liqvd.digibox.test:id/edtPassword")).sendKeys("Gaurav@123");
		driver.findElement(By.id("com.liqvd.digibox.test:id/btnSignIn")).click();
		System.out.println("Login test succefull");
	}
	@Test(priority=2)
	public void createfolder() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@content-desc=\"Add\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.liqvd.digibox.test:id/llCreateNewFolder")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.liqvd.digibox.test:id/edtCreateFolderName")).sendKeys("L2");
		Thread.sleep(4000);
		driver.findElement(By.id("com.liqvd.digibox.test:id/btnCreateFolder")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@content-desc=\"Add\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout")).click();
		System.out.println("Uploading files test succeful");
}
	@Test(priority=3)
	public void filterfile() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.id("com.liqvd.digibox.test:id/imgBack")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.liqvd.digibox.test:id/ivFilter")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.liqvd.digibox.test:id/rbDateToday")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.liqvd.digibox.test:id/btnApply")).click();
}
}