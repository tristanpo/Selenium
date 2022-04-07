package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        boolean header= driver.findElement(By.className("gum")).isDisplayed();
        System.out.println("Header text is present= "+header);
        Thread.sleep(1000);
        driver.switchTo().frame(1);
        boolean enrollButn=driver.findElement(By.className("text-block-2")).isEnabled();
        System.out.println("Enroll today button is enabled= "+enrollButn);
        driver.quit();



        }
    }

