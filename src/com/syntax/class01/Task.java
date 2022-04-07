package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/ref=nav_logo");
        String url = driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(title+" "+url);
        driver.quit();
    }
}
