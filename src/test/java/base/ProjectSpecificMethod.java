package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import utils.ReadExcelData;

	public class ProjectSpecificMethod {
		public RemoteWebDriver driver;
		public String excelFilePath;
		
		@Parameters()
		@BeforeMethod
		public void beforemethod() throws IOException {
			//This class help me to read Properties file 
			Properties prop=new Properties();
			//Creating a new file input to make given file to readable component
			 FileInputStream file= new FileInputStream(new File("src/test/resources/AppConfiguration.properties"));
			//Load the property Input stream file
			 prop.load(file);
			 //get the data out of property file using key
			 String url = prop.getProperty("AppURL");
			 System.out.println(url);
			 String browsername = prop.getProperty("Browser");
			 System.out.println(browsername);
			 
			 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@AfterMethod
		public void aftermethod() {
			driver.close();
		}
		@DataProvider(name ="TC001_DATA")
		public String[][] testdata() throws IOException {
			String [][] data =ReadExcelData.getData(excelFilePath);
			return data;
		}
		}



