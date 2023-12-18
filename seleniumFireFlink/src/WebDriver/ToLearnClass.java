package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.shoppersstack.com/search-products/");
driver.findElement(By.className("MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv")).click();
	}

}
