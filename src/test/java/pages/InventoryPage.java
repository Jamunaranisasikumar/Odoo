package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class InventoryPage extends ProjectSpecificMethod{
	public InventoryPage(RemoteWebDriver driver) {
	this.driver = driver;
	}
	public InventoryListPage clickProducts() {
		driver.findElement(By.xpath("//span[text()='Products']")).click();
		driver.findElement(By.xpath("//div/a[text()='Products']")).click();
		return new InventoryListPage(driver);
	}
}

