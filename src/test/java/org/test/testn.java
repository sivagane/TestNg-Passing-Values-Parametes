package org.test;

import javax.swing.SpringLayout.Constraints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testn {
WebDriver d;

By User=By.id("email");
By Pass=By.id("pass");
By LogBtn=By.id("loginbutton");

public testn(WebDriver d) {
	this.d=d;
}
public void facebook(String uid ,String p) {
	d.findElement(User).sendKeys(uid);
	d.findElement(Pass).sendKeys(p);
	d.findElement(LogBtn).click();
}

public void typeusername(String na) {
	d.findElement(User).sendKeys(na);
}
public void typepassword(String pa) {
	   d.findElement(Pass).sendKeys(pa);
	}
public void clickbutton() {
	d.findElement(LogBtn).click();
}

}
