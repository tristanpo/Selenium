package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Tristan");
        driver.findElement(By.id("customer.lastName")).sendKeys("Poseley");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Home Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("PleasantVille");
        driver.findElement(By.id("customer.address.state")).sendKeys("Colorado");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12312");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("321-456-9876");
        driver.findElement(By.id("customer.ssn")).sendKeys("321-65-3457");
        driver.findElement(By.id("customer.username")).sendKeys("Trista123");
        driver.findElement(By.id("customer.password")).sendKeys("password5");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password5");

       // Thread.sleep(2000);

        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}