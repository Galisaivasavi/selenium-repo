package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.fireflink.com/");
            String Url = driver.getCurrentUrl();
            System.out.println(Url);
            if (Url.equals("https://www.fireflink.com/"))
            {
            	System.out.println("User Navigated");
            }
            else
            System.out.println("User Failed");
	}

}

