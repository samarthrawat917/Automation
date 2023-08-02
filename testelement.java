package Session_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testelement {

 public static void main(String[] args) {
 // Initialization
  System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\selenium\\chromedriver.exe");
  
 // Instance variable
  WebDriver driver = new ChromeDriver();
  
 // Request
  driver.get("http://www.facebook.com");
  
//  driver.findElement(By.name("email")).sendKeys("thangvels3@gmail.com");
  
  WebElement email = driver.findElement(By.name("email"));
  email.sendKeys("thangvels3@gmail.com");
  
  WebElement pass = driver.findElement(By.name("pass"));
  pass.sendKeys("hsgfkjahfjlkahfkh");
  
  WebElement login = driver.findElement(By.name("login"));
  login.click();
  
  
//  driver.findElement(By.name("pass")).sendKeys("hfkjhasdkjfhj");
//  driver.findElement(By.name("login")).click();
  
  System.out.println("print for User id......input Box");
  System.out.println(email.getAttribute("class"));
  System.out.println(email.getCssValue("style"));
  System.out.println(email.getSize());
  System.out.println(email.getTagName());
  System.out.println(email.getText());
  System.out.println(email.getRect());
  System.out.println(email.getClass());
  System.out.println(email.isDisplayed());
  System.out.println(email.isEnabled());
  System.out.println(email.isSelected());
  email.sendKeys("Rubel@gmail.com");
//for password
		System.out.println("\nprint for Password......input Box");
		System.out.println(pass.getAttribute("name"));
		System.out.println(pass.getCssValue("style"));
		System.out.println(pass.getSize());
		System.out.println(pass.getTagName());
		System.out.println(pass.getText());
		System.out.println(pass.getRect());
		System.out.println(pass.getClass());
		System.out.println(pass.isDisplayed());
		System.out.println(pass.isEnabled());
		System.out.println(pass.isSelected());
		pass.sendKeys("ABC1234");
//for password
		System.out.println("\nprint for Log In Button");
		System.out.println(login.getAttribute("id"));
		System.out.println(login.getCssValue("style"));
		System.out.println(login.getSize());
		System.out.println(login.getTagName());
		System.out.println(login.getText());
		System.out.println(login.getRect());
		System.out.println(login.getClass());
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		System.out.println(login.isSelected());
		login.click();
//teardown
		driver.quit();

  
 }
}
