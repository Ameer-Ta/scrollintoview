package com.scrollintoview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollintoview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com");
	      Thread.sleep(1000);
	      driver.manage().window().maximize();
	      WebElement Element=driver.findElement(By.xpath("//div[@id='sidebar']//aside[3]//ul[1]//li[10]"));
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,250)", ""); // window scroll down
	      
	      js.executeScript("arguments[0].scrollIntoView();", Element);//element scroll down
	      Thread.sleep(1000);
	     
	      js.executeScript("window.scrollBy(0,-350)", "");

	}

}
