package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	public void login()
	{
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://10.106.246.33/");

        WebElement username_textbox = driver.findElement(By.id("loginPage_username"));
        username_textbox.sendKeys("globaladmin");
        WebElement password_textbox = driver.findElement(By.id("loginPage_password"));
        password_textbox.sendKeys("password");
        WebElement button = driver.findElement(By.name("loginPage_LoginButton_label"));
        button.click();

        driver.quit();
	}
	
	
}
