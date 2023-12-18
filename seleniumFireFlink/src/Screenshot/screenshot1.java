package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		ChromeDriver ts= (ChromeDriver)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ss1/error1.png");
		FileHandler.copy(temp, dest);
		

	}

}
