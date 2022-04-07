package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links" + allLinks.size());
        for (WebElement link : allLinks) {
            String linktext = link.getText();
            String fullLink = link.getAttribute("href");
            if (!linktext.isEmpty()) {
                System.out.println(linktext + "      " + fullLink);
            }
        }
        driver.quit();
    }
}
