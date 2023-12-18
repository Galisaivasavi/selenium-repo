package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://www.shoppersstack.com/");
    		 String title = driver.getTitle();
    		 String Url = driver.getCurrentUrl();
    		 
     System.out.println(title);
     System.out.println(Url);
     driver.quit();
     
	}

}
