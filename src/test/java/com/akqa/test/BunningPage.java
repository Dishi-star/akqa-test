package com.akqa.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import objectDump.LandingPage;

public class BunningPage extends OpenBrowser {

	LandingPage lp;

	// This will run before every test methods
	@BeforeTest
	public void initialize() throws IOException {
		WebDriver driver = Openbrowser();
	}

	// This method is use to verify the page title and contains the whole automation flow.
	@Test
	public void addingItem() throws IOException {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get(prop.getProperty("url"));
		AssertJUnit.assertEquals("Australia DIY, Garden & Hardware Store - Bunnings Australia", driver.getTitle());
		driver.manage().window().maximize();
		lp = new LandingPage(driver);
		lp.search().sendKeys("paint");
		lp.Icon().click();
		lp.ClickStore().click();
		AssertJUnit.assertEquals("Search results - Bunnings Australia", driver.getTitle());
		lp.clickCollect().click();
		lp.ClickStore().click();
		lp.addToCart().click();
		lp.cartPage().click();

	}
	
	
	// This method is used to check the product name.
	@Test
	public void checkItemName() {
		lp = new LandingPage(driver);
		AssertJUnit.assertEquals("Dulux Ceiling White Paint", lp.nameCheck().getText());

	}

	@AfterTest
	public void shutdown() {
		driver.close();
	}

}
