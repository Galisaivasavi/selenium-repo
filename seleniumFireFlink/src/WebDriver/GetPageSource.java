package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.fireflink.com/");
		String Source = driver.getPageSource();
		System.out.println(Source);
		
		
		

	}

}
