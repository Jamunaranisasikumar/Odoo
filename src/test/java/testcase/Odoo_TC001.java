package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import base.ProjectSpecificMethod;
import pages.LoginPage;

public class Odoo_TC001 extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		excelFilePath="./TestData/AspireTC.xlsx";
		
	}
	@Test(dataProvider ="TC001_DATA")
	public void runTC001(String username,String password,String ProductName) throws InterruptedException {
		new LoginPage(driver)
		.enterpassword(password)
		.enterusername(username)
		.clicklogin()
		.clickInventory()
		.clickProducts()
		.clickCreate()
		.enterProductName(ProductName)
		.clicksave()
		.updateUqaulity()
		.clickAppicon()
		.clickManufac()
		.clickcreate()
		.selectProductname(ProductName)
		.ConformandSave()
		.StatustoDone()
		.checkdata();
		
	}

}
