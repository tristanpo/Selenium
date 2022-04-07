package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(1000);
        WebElement alertButn=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        alertButn.click();
        Alert confirmButn=driver.switchTo().alert();
        confirmButn.accept();
        Thread.sleep(1000);
        WebElement alertBox=driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]"));
        alertBox.click();
        driver.switchTo().alert();
        confirmButn.accept();
        Thread.sleep(1000);
        WebElement lastBox=driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
        lastBox.click();
        driver.switchTo().alert();
        confirmButn.sendKeys("Tristan");
        confirmButn.accept();
        Thread.sleep(1000);
        driver.quit();




    }
}
