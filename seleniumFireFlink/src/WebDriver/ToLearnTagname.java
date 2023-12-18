package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		List<WebElement> links = driver.findElements(By.tagName("span"));
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println(links.size());
		System.out.println(image.size());
	}

}
