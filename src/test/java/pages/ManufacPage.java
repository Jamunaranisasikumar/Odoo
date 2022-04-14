package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class ManufacPage extends ProjectSpecificMethod{
	public ManufacPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public NewManufacPage clickcreate() {
		driver.findElement(By.xpath("//button[contains(@class,'button_add')]")).click();
		return new NewManufacPage(driver);
	}
}
