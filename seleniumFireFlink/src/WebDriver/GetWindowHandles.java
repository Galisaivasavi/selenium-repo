package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		Set<String> WindowIds = driver.getWindowHandles();
		for(String i:WindowIds)
		{
		System.out.println(i);
	}

	}

}
