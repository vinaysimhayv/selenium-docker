package vin;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;

@org.testng.annotations.Test
public class Qaclick {
	
	
	RemoteWebDriver driver;
	
	
	
	//public WebDriver driver;
	@Test(priority=1)
	void setup() throws MalformedURLException {
		System.out.println("Setup Method");

		/*
		System.out.println("In Setup method");
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.chrome.driver",path+"//resources//chromedriver_mac");

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL u = new URL("http://172.17.0.2:8000/wd/hub");
		 driver = new RemoteWebDriver(u, cap);

		driver = new ChromeDriver();
		Assert.assertTrue(true);
		*/
		
	}
	
	@Test(priority=2)
	void launch() throws InterruptedException {
		System.out.println("Setup Method");
		/*
		System.out.println("Launching qaclick academy website");
		driver.get("http://www.qaclickacademy.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
 		*/
	}

	@Test(priority=3)
	void login() throws InterruptedException {
		System.out.println("Login Method");

		/*
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'sign_in')]")).click();
		System.out.println("Clicked on sign in");
		Thread.sleep(2000);
		driver.findElement(By.id("user_email")).sendKeys("vinaysv22@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("thekings");
		driver.findElement(By.name("commit")).click();
		String value = driver.findElement(By.xpath("//a[@class='link-below-button']")).getText();
		Assert.assertEquals(value, "Forgot Password?");
		*/
		
	}
	
	
	
	@Test(priority=4)
	void captureText() {
		System.out.println("Login Method");

		/*
		System.out.println("Capturing text");
		driver.findElement(By.xpath("//a[@class='link-below-button']")).click();
		String text = driver.findElement(By.xpath("//div[@class='main-hero']/h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Reset Password");
		*/
		}
	
}
