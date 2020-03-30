package org.pom;

import org.testng.annotations.Test;

public class ExecuatbleClass extends BaseClass {
	@Test
public void run() {
	d.get("https://www.facebook.com/");
	LoginPage l=new LoginPage();
	
	fill(l.getUser(),"sivag918@gmail.com");
	fill(l.getPass(),"08091990");
	kilk(l.getLbtn());
	kill();
	
}
}
