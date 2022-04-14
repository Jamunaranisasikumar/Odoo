package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	public LoginPage(RemoteWebDriver driver) {
		this.driver= driver;
	}
	public LoginPage enterusername(String username) {
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys(username);
		return this;
	}
	public LoginPage enterpassword(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		return this;
	}
	public MenuPage clicklogin() {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		return new MenuPage(driver);
	}
}
