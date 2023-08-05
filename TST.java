package Session_00;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TST {

	public static void main(String[] args) {
		//init
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\selenium\\Browser"
				+ " Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediffmail.com");
		driver.manage().window().maximize();
//create obj
		Dimension abc = new Dimension(700, 1200);
		driver.manage().window().setSize(abc);
		
//
		driver.quit();
	}

}
