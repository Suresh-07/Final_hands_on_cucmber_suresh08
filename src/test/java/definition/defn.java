package definition;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class defn {
	public static String url="http://localhost:1080/WebTours/index.htm";
	WebDriver driver;
	
	
	@Given("Its should be in homepage of the Webtour")
	public void its_should_be_in_homepage_of_the_webtour() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@When("User enter the  username {string}")
	public void user_enter_the_username(String string) {
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys(string);
	    
	}
	@Then("User enter the password {string}")
	public void user_enter_the_password(String string) {
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(string);
	   
	}
	@Then("User should click on login button")
	public void user_should_click_on_login_button() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
	    
	}
	@Then("User should click on signup")
	public void user_should_click_on_signup() {
		driver.findElement(By.linkText("SignOff Button")).click();
		driver.quit();
	    
	}
	

}
