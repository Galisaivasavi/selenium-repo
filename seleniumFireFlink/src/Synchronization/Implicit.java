package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.instagram.com/");
          driver.findElement(By.name("username")).sendKeys("testing");
          driver.findElement(By.name("password")).sendKeys("test@123");
          
	}

}
