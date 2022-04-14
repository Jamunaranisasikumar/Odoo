package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class InventoryListPage extends ProjectSpecificMethod{
	public InventoryListPage(RemoteWebDriver driver) {
	this.driver = driver;
	}
	public NewInventoryPage clickCreate() {
		driver.findElement(By.xpath("//div[@role='toolbar']//button")).click();
		return new NewInventoryPage(driver);
	}
}
