package com.syntax.review03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static String url = "http://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //find the alert and click on it

        WebElement SimpleAlert=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        SimpleAlert.click();
        //handling the alert
        Alert alert=driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        WebElement jsAlert=driver.findElement(By.xpath("//button[@onclick='myPromtFunction()']"));
       Thread.sleep(1000);
        jsAlert.click();
        Thread.sleep(1000);


        driver.switchTo().alert();
        alert.sendKeys("hello everyone!");
        alert.accept();

    }
}
