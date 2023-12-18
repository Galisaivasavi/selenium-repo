package Listenersss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Implementingclass.class)
public class TestScript {


@Test
public void Login() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys("vasavigjks@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Vasavi@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Assert.assertEquals(true, false);
}}