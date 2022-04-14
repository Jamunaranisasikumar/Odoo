package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MenuPage extends ProjectSpecificMethod{

	public MenuPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public InventoryPage clickInventory() {
		driver.findElement(By.xpath("//div/a[@id='result_app_1']")).click();
		return new InventoryPage(driver);
	}
	public ManufacPage clickManufac() {
		driver.findElement(By.xpath("//a[@id='result_app_2']")).click();
		return new ManufacPage(driver);
	}

}
