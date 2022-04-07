package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createAcc= driver.findElement(By.xpath("//a[contains(@data-testid,'open-regis')]"));
        createAcc.click();
        Thread.sleep(1000);
        WebElement monthDD= driver.findElement(By.id("month"));
        Select month=new Select(monthDD);
        List<WebElement>allOptions=month.getOptions();
        int size=allOptions.size();
        System.out.println("Month DD "+size);
        month.selectByVisibleText("Jan");
        Thread.sleep(1000);
        WebElement dayDD=driver.findElement(By.id("day"));
        Select day=new Select(dayDD);
        List<WebElement>allOptions1=day.getOptions();
        int size2=allOptions1.size();
        System.out.println("Day DD "+size2);
        day.selectByValue("31");
        Thread.sleep(1000);
        WebElement yearDD=driver.findElement(By.id("year"));
        Select year=new Select(yearDD);
        List<WebElement>allOptions2=year.getOptions();
        int size3=allOptions2.size();
        System.out.println("Year DD "+size3);
        year.selectByValue("2001");
        Thread.sleep(1000);
        driver.quit();

    }
}
