package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnFullScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://skillrary.com/");
		driver.manage().window().fullscreen();
		

	}

}
