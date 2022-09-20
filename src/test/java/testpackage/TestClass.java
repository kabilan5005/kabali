package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mainpackage.MainClass;
import pageobject.TestObject;

public class TestClass extends MainClass{
		//private Logger log = Logger.getLogger(GoogleSearchClass.class);
		@Test(dataProvider="sampledata", description = "TestCheck", priority = 1,
		enabled = true)
		public void homepage_keysenter(String UserName,String Password) {
		logger = extent.startTest("homepage_keysenter");
		TestObject obj=new TestObject(driver,logger);
		obj.veryHeader(UserName);
		}
		@DataProvider(name="sampledata")
		public Object[][] sampledata(){Object[][] data =
		getExcelData("data.xlsx","Sheet1");
		return data;
		}
		}


