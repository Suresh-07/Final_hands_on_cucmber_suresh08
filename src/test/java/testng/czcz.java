package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class czcz {
	public static String url="http://localhost:1080/WebTours/";
	WebDriver driver;
	
	@BeforeTest
	public void tc() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void tc2() throws InterruptedException {
		driver.findElement(By.name("userSession")).sendKeys(".*");
		driver.findElement(By.name("username")).sendKeys("Suresh");
		driver.findElement(By.name("password")).sendKeys("Talakal");
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		driver.quit();
	}

}
