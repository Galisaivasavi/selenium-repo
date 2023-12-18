package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnMaximize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.close();

	}

}
