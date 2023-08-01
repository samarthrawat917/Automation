package Session_00;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDimension_11 {

	public static void main(String[] args) {
// init
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL"
				+ "\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		// instance
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yatra.com");
		System.out.println("Title..:"+driver.getTitle());
		System.out.println("URL...:"+driver.getCurrentUrl());
// instance
		Dimension abc = new Dimension(600, 1200);
		driver.manage().window().setSize(abc);
// close
		//driver.close();
		
	}

}
