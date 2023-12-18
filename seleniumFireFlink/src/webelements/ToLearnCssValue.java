package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("testing");
		WebElement passwordtf = driver.findElement(By.id("password"));
		passwordtf.clear();
		passwordtf.sendKeys("testing@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(2000);
		String color = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getCssValue("color");
        System.out.println(color);
	}
}
