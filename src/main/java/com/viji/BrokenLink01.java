package com.viji;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink01 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
//		use Java methods
//		URL urlObject = new URL(url);  //Predefined obj creation
//		HttpURLConnection connection = (HttpURLConnection)urlObject.openConnection(); //Using th predefined obj
//		HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection(); (Using the obj creation in runTime)
//		connection.setRequestMethod("HEAD");
//		connection.connect();
//		int responseCode = connection.getResponseCode();
//		System.out.println(responseCode);
//		For the broken Link
		String brokenLinkText = driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
		HttpURLConnection brokenLinkConnection = (HttpURLConnection) new URL(brokenLinkText).openConnection();
		brokenLinkConnection.setRequestMethod("HEAD");
		brokenLinkConnection.connect();
		int responseCode = brokenLinkConnection.getResponseCode();
		System.out.println(responseCode);

	}

}
