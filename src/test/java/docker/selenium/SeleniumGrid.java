package docker.selenium;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {

	@Test
	public void testOne() {
		try {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setPlatform(Platform.LINUX);

			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.225.148:4444/wd/hub"), cap);
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			System.out.println(driver.getTitle());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void tesTwo() {
		try {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setPlatform(Platform.LINUX);

			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.225.148:4444/wd/hub"), cap);
			driver.get("https://www.youtube.com");
			Thread.sleep(2000);
			System.out.println(driver.getTitle());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
