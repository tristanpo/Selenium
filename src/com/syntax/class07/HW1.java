package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        WebElement tabBtn = driver.findElement(By.id("tabButton"));
        WebElement winBtn = driver.findElement(By.id("windowButton"));
        WebElement newBtn = driver.findElement(By.id("messageWindowButton"));
        Thread.sleep(1000);
        tabBtn.click();
        winBtn.click();
        newBtn.click();


        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();
        while (it.hasNext()) {
            String handle = it.next();
            if (!mainPageHandle.equals(handle)) {
                driver.switchTo().window(handle);
                WebElement text=driver.findElement(By.id("//body"));
                System.out.println(text.getText());
                driver.quit();
            }

        }

    }
}