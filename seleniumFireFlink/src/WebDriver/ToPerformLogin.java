package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.shoppersstack.com/user-signin");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("vasavigjs@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("Vasavi@123");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

	}
}
