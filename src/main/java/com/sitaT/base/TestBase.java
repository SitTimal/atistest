package com.sitaT.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		// this is night class saturday.
		try {
			prop = new Properties();

			FileInputStream fileInputStream = new FileInputStream(
					"C:\\Users\\SitaTimalsina\\eclipse-workspace\\com.sitaT\\src\\main\\java\\com\\sitaT\\base\\TestBase.java");
			prop.load(fileInputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
