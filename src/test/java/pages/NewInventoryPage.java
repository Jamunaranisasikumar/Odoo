package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificMethod;

public class NewInventoryPage  extends ProjectSpecificMethod {
	WebDriverWait wait ;

	public NewInventoryPage(RemoteWebDriver driver) {
		this.driver = driver;
		}
	public NewInventoryPage enterProductName(String ProductName) throws InterruptedException {
		//Thread.sleep(30);
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1/div")));

		WebElement productname = driver.findElement(By.xpath("//div[@class='d-flex']//input[contains(@class,o_text_overflow)]"));
		productname.sendKeys(ProductName,Keys.ENTER);
		return this;
	}
	public NewInventoryPage clicksave() throws InterruptedException {
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Save record']")));

		driver.findElement(By.xpath("//button[@title='Save record']")).click();
		return this;
	}
	public NewInventoryPage updateUqaulity() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Update Quantity']")).click();
		driver.findElement(By.xpath("//div[@class='o_list_buttons d-flex']")).click();
		WebElement quantity = driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]/input"));
		quantity.clear();
		quantity.sendKeys("12");
		driver.findElement(By.xpath("//button[@title='Save record']")).click();
		return this;
	}
	public MenuPage clickAppicon() {
		driver.findElement(By.xpath("//a[@title='Home menu']")).click();
		return new MenuPage(driver);
	}
}
