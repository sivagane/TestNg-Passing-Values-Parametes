package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver d;
public static void launch(String s) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\TestNg\\div\\chromedriver.exe");
	d=new ChromeDriver();
	d.get(s);
}

public static void fill(WebElement w,String s) {
	w.sendKeys(s);
}
public static void kilk(WebElement w) {
	w.click();
}
public static void kill() {
	d.quit();
	}
}
