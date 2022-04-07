package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("jane");
        driver.findElement(By.name("lastname")).sendKeys("doe");
        driver.findElement(By.name("reg_email__")).sendKeys("janedoe@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("janedoe@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password5");
        driver.quit();


    }
}
