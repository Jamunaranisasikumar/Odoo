package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class NewManufacPage extends ProjectSpecificMethod {
	public NewManufacPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public NewManufacPage selectProductname(String ProductName) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[1]/tbody/tr[5]/td[2]/div/div[1]/div/input")).sendKeys(ProductName);
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
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
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
