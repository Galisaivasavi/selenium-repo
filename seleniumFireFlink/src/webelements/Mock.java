package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriver driver= new ChromeDriver();
           driver.manage().window().maximize();
           WebDriverWait dw = new WebDriverWait(driver,Duration.ofSeconds(20));
           driver.get("https://demowebshop.tricentis.com/books");
           WebElement day = driver.findElement(By.id("products-pagesize"));
          Select s= new Select(day);
          s.selectByVisibleText("12");
           
           
	}

}
