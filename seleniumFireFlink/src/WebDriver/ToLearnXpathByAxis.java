package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String moviename = "Vikram";
		driver.get("file:///C:/Users/User/Desktop/html.html");
		String collection = driver.findElement(By.xpath("//td[contains(text(),'"+moviename+"')]/following-sibling::td")).getText();
		String position = driver.findElement(By.xpath("//td[contains(text(),'"+moviename+"')]/preceding-sibling::td")).getText();
		System.out.println("collection:"+collection);
		System.out.println("position:"+position);
		

	}

}