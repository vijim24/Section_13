package com.viji;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous03 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		Maximize the window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("abcd");
		
		driver.get("https://www.google.com/");
	}

}
