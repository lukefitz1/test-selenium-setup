package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HelloWorld {
	
	WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void setUpTests() throws MalformedURLException {		
		System.out.println("Before Class");
		//Set up desired capabilities for test
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName("chrome");
		cap.setVersion("50");

		//create new driver, set window size and timeout
		//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		//driver.manage().window().setSize(new Dimension(1280, 750));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(groups = { "functional" }, priority=0)
	public void goToGoogle() {
		System.out.println("Hello world");
		//driver.get("http://google.com/");
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		System.out.println("After Class");
		//driver.quit();
	}
	
}
