package com.akqa.test;

import java.io.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static WebDriver driver;
	public Properties prop;

	public WebDriver Openbrowser() throws IOException {

		prop = new Properties();// this is to use the global parameter file.
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/com/akqa/test/Data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/java/com/akqa/test/chromedriver");
			// if you want to run the test without opening browser(ie headless)
			ChromeOptions option = new ChromeOptions();
			if (browsername.contains("headless")) {
				option.addArguments("headless");
			}
			driver = new ChromeDriver(option);

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		return driver;
	}

}
