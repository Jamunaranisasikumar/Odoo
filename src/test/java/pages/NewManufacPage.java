package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.ProjectSpecificMethod;

public class NewManufacPage extends ProjectSpecificMethod {
	WebDriverWait wait ;
	public NewManufacPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public NewManufacPage selectProductname(String ProductName) throws InterruptedException {
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[1]/tbody/tr[5]/td[1]/label")));
		WebElement productname = driver.findElement(By.xpath("(//input[contains(@class,'o_input ui-autocomplete-input')])[1]"));
		productname.sendKeys(ProductName,Keys.ENTER);
		return this;
	}
	public NewManufacPage ConformandSave() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='action_confirm']")).click();
		driver.findElement(By.xpath("//button[@title='Save record']")).click();
		return this;
	}
	public NewManufacPage StatustoDone() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@confirm,'no components')]/span[text()='Mark as Done']")).click();
        driver.findElement(By.xpath("//span[text()='Ok']")).click();
		driver.findElement(By.xpath("//span[text()='Apply']")).click();
		return this;
	}
	public NewManufacPage checkdata() throws InterruptedException {
		String RefID = driver.findElement(By.xpath("//span[@placeholder='Manufacturing Reference']")).getText();
 		System.out.println("Manufacturing order Reference ID:" +RefID);
 		Thread.sleep(1500);
 		driver.findElement(By.xpath("//button[@title='Save record']")).click();//save		
 		String status = driver.findElement(By.xpath("(//div[@class='o_Message_trackingValue'])[1]")).getText();
 		if(status.contains("Done")) {
 			System.out.println("New Manufacturing Order is created with status DONE");
 		}else{
 			System.out.println("New Manufacturing Order status is not DONE");
 		}
		return this;
	}
}
