package WebDriver;

import java.math.BigInteger;
import java.security.spec.ECPoint;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://skillrary.com/");
		driver.manage().window().setPosition(new Point(20,100));
	}

}
