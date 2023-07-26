package TestNG_66;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert_00 {
	WebDriver driver;
	Alert Salert;
	Alert Calert;
	Alert Dalert;
	@Test(priority=0)
	public void Salert() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.cssSelector("#OKTab > button")).click();
		Thread.sleep(2000);
		Salert = driver.switchTo().alert();
		String MSG0 = Salert.getText();
		System.out.println("Alert..:"+MSG0);
		Salert.accept();
	}
	@Test(priority=1)
	public void Calert() throws InterruptedException	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.cssSelector("#CancelTab > button")).click();
		Calert = driver.switchTo().alert();
		Thread.sleep(2000);
		String MSG1 = Calert.getText();
		System.out.println("Alert..:"+MSG1);
		//Calert.accept();
		Thread.sleep(2000);
		Calert.dismiss();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void Dalert() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		Dalert = driver.switchTo().alert();
		Thread.sleep(2000);
		String MSG2 = Calert.getText();
		System.out.println("Alert..:"+MSG2);
		Thread.sleep(2000);
		Dalert.sendKeys("hi");
		Dalert.accept();
		Thread.sleep(2000);
		//Dalert.dismiss();
		Thread.sleep(2000);

	}
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop"
				+ "\\selenium\\Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
