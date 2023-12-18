package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		File temp = driver.findElement(By.xpath("//div[@class='desktop-logoContainer']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./ss1/image2.png");
		FileHandler.copy(temp, dest);
		
	}

}
