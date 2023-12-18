package listenersss1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass1 {
public static WebDriver driver;
@BeforeClass
public void browsersetup() {
	driver=new ChromeDriver();
}

}
