package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotInsta {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		File temp = driver.findElement(By.xpath("//div[@style=\"cursor: pointer;\"]")).getScreenshotAs(OutputType.FILE);
		File dest = new File(".errorshot/image3.png");
		FileHandler.copy(temp, dest);

	}

}
