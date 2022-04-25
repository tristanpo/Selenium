package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame(0);
        WebElement topic=driver.findElement(By.xpath("//b[@id='topic']"));
        System.out.println(topic.getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

       WebElement dropdown= driver.findElement(By.tagName("select"));
       Select sel=new Select(dropdown);
       sel.selectByIndex(2);

       driver.switchTo().defaultContent();

       driver.switchTo().frame(0);
       driver.switchTo().frame("frame3");

        WebElement checkbox= driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();

    }
}
