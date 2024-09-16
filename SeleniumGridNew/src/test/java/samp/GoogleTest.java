package samp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	private String baseURL = "http://www.google.com";
	private WebDriver driver;

	@Test
	public void homePageTest() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		// caps.setCapability(CapabilityType, false);
		driver = new RemoteWebDriver(new URL(" http://192.168.0.115:4444"), caps);
		driver.get(baseURL);
		System.out.println("Title of the page: " + driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Lavanya Channappa");
		driver.quit();
	}
}
