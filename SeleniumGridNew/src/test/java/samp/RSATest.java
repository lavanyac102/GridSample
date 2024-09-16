package samp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {

	private String baseURL = "http://rahulshettyacademy.com";
	private WebDriver driver;

	@Test
	public void homePageTest() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(Platform.WINDOWS);
		caps.setBrowserName("chrome");
		//caps.setCapability(CapabilityType.BROWSER_NAME,"firefox" );
		
		driver = new RemoteWebDriver(new URL(" http://192.168.0.115:4444"), caps);
		driver.get(baseURL);
		System.out.println("Title of the page: " + driver.getTitle());
		driver.quit();
	}
}
