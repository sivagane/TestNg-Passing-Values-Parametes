package org.verify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.testn;
import org.testng.annotations.Test;

public class Verifyfacebook {

	@Test
	public void verifylogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\TestNg\\div\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		
		testn te=new testn(d);
		
		te.typeusername("sivag918@gmail.com");
		te.typepassword("08091990");
		te.clickbutton();
		
		te.facebook("sivag918@gmail.com","08091990");
		
		d.quit();
	}
}
