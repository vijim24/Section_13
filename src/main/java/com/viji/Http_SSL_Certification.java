package com.viji;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Http_SSL_Certification {

	public static void main(String[] args) {
//		ChromeOptions - Will set the behaviour of the browser
		ChromeOptions options = new ChromeOptions();
//		setAcceptInsecureCerts -- Will accept all kinds of certificates
		options.setAcceptInsecureCerts(true);
//		Setting up proxy- use proxy class
		Proxy proxy = new Proxy();
//		Passing in the string - given
		proxy.setHttpProxy("ipaddress:444");
//		Passing in the proxy to the Chrome Capabilities
		options.setCapability("proxy", proxy);
//		Passing the behaviour set to the Chrome Browser
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
