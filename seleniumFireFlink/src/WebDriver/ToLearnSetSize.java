package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetSize {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://skillrary.com/");
		 driver.manage().window().setSize(new Dimension(300,500));
		 driver.close();
}
}