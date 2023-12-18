package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClearText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.id("username")).clear();
		WebElement passwordtf = driver.findElement(By.id("password"));
		passwordtf.clear();
		passwordtf.sendKeys("testing@123");
		Thread.sleep(2000);
		passwordtf.clear();
	}

}
