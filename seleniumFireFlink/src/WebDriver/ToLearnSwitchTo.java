package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.shoppersstack.com/products_page/3");
Thread.sleep(2000);
driver.findElement(By.id("compare")).click();
Set<String> allWindowIds = driver.getWindowHandles();

for(String id:allWindowIds)
{
	driver.switchTo().window(id);
	Thread.sleep(2000);
	if(driver.getCurrentUrl().contains("flipkart"));
	{
		break;
	}
}
	driver.manage().window().maximize();
	}

}


	


