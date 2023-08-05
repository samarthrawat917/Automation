package Session_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestReturn_22 {

	public static void main(String[] args) throws InterruptedException {

// init
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\selenium\\Browser"
				+ " Driver\\chromedriver.exe");
// instance
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
// locate/store
		WebElement UID = driver.findElement(By.id("email")); // normal
		WebElement PWS = driver.findElement(By.cssSelector("//*[@id='pass']")); // css
		WebElement BTN = driver.findElement(By.xpath("//*[@value='1']")); // relative
// output
		System.out.println("print for User id......input Box");
		System.out.println(UID.getAttribute("class"));
		System.out.println(UID.getCssValue("style"));
		System.out.println(UID.getSize());
		System.out.println(UID.getTagName());
		System.out.println(UID.getText());
		System.out.println(UID.getRect());
		System.out.println(UID.getClass());
		System.out.println(UID.isDisplayed());
		System.out.println(UID.isEnabled());
		System.out.println(UID.isSelected());
// wait
		Thread.sleep(6000);
		UID.sendKeys("Rubel@gmail.com");
// for password
		System.out.println("\nprint for Password......input Box");
		System.out.println(PWS.getAttribute("name"));
		System.out.println(PWS.getCssValue("style"));
		System.out.println(PWS.getSize());
		System.out.println(PWS.getTagName());
		System.out.println(PWS.getText());
		System.out.println(PWS.getRect());
		System.out.println(PWS.getClass());
		System.out.println(PWS.isDisplayed());
		System.out.println(PWS.isEnabled());
		System.out.println(PWS.isSelected());
		PWS.sendKeys("ABC1234");
// for password
		System.out.println("\nprint for Log In Button");
		System.out.println(BTN.getAttribute("id"));
		System.out.println(BTN.getCssValue("style"));
		System.out.println(BTN.getSize());
		System.out.println(BTN.getTagName());
		System.out.println(BTN.getText());
		System.out.println(BTN.getRect());
		System.out.println(BTN.getClass());
		System.out.println(BTN.isDisplayed());
		System.out.println(BTN.isEnabled());
		System.out.println(BTN.isSelected());
		BTN.click();
// teardown
		driver.quit();






	}

}
