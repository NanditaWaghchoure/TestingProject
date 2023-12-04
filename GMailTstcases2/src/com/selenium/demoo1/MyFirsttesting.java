package com.selenium.demoo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirsttesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\SleniuimEverything\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("nanditawaghchoure123@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		String at=driver.getTitle();
		String et="gmail";
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Successfully");
			
		}
		else {
			System.out.println("Test Failed");
		}
		
		

	}

}
