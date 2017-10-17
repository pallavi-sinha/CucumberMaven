package com.CucumberMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public static WebDriver driver;
	 //driver = new ChromeDriver();
	
	 @BeforeTest
	public void testng()
	{		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");

		driver= new ChromeDriver();
driver. get("https://www.google.com");	
	}
	
	@Test
	@Given("^user has launched the Fidelity charitable website$")
	
public void user_has_launched_the_Fidelity_charitable_website() throws Throwable {
		    driver.get("https://www.fidelitycharitable.org/");
   // throw new PendingException();
}

	@Test
@When("^he clicks on login button$")
public void he_clicks_on_login_button() throws Throwable {
	driver.findElement(By.xpath("/html/body/header/div[1]/div/div/nav/ul/li[4]/a")).click();
   // throw new PendingException();
}

	@Test
@When("^enter incoorect ID and password$")
public void enter_incoorect_ID_and_password() throws Throwable {
	driver.findElement(By.id("userId")).sendKeys("Test");
	driver.findElement(By.id("password")).sendKeys("Test");
	driver.findElement(By.xpath("//*[@id='Login']/div[3]/div/button")).click();
    //throw new PendingException();
}

	@Test
@Then("^system should throw an error$")
public void system_should_throw_an_error() throws Throwable {
	String a = driver.findElement(By.className("server-error")).getText();
	Assert.assertTrue(a.equals("Information you have entered is not correct"));
    //throw new PendingException();
}

	@Test
@Then("^should not let user login$")
public void should_not_let_user_login() throws Throwable {
	System.out.println("5");
    //throw new PendingException();
}


}
