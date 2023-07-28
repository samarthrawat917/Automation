package Session_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBbrowser_00 {

	public static void main(String[] args) {
//init
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\selenium"
				+ "\\Browser Driver\\chromedriver.exe");
//instance
		WebDriver driver = new ChromeDriver();
		
//request
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
//locate
		WebElement UID = driver.findElement(By.name("email"));
		WebElement PSD = driver.findElement(By.name("pass"));
		WebElement BTN = driver.findElement(By.name("loginbutton"));
//output
		System.out.println("print for user id ...input box");
		System.out.println(UID.getAttribute("email"));
		System.out.println(UID.getCssValue("style"));
		System.out.println(UID.getSize());
		System.out.println(UID.getTagName());
		System.out.println(UID.getText());
		System.out.println(UID.getRect());
		System.out.println(UID.getClass());
		System.out.println(UID.isDisplayed());
		System.out.println(UID.isEnabled());
		System.out.println(UID.isSelected());
		UID.sendKeys("Rubel@gmail.com");
//for password
		System.out.println("print for user id ...input box");
		System.out.println(PSD.getAttribute("email"));
		System.out.println(PSD.getCssValue("style"));
		System.out.println(PSD.getSize());
		System.out.println(PSD.getTagName());
		System.out.println(PSD.getText());
		System.out.println(PSD.getRect());
		System.out.println(PSD.getClass());
		System.out.println(PSD.isDisplayed());
		System.out.println(PSD.isEnabled());
		System.out.println(PSD.isSelected());
		PSD.sendKeys("abc1234");
//for button
		System.out.println("print for user id ...input box");
		System.out.println(BTN.getAttribute("email"));
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
//teardown
		driver.quit();
	}
	

}
