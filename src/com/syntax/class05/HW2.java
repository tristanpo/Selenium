package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Tristan");
        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Poseley");
        WebElement pNumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        pNumber.sendKeys("303-202-1010");
        WebElement passWord=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        passWord.sendKeys("Password123");
        Thread.sleep(1000);
        WebElement monthDD= driver.findElement(By.id("month"));
        Select month=new Select(monthDD);
        List<WebElement> allOptions=month.getOptions();
        month.selectByVisibleText("Jan");
        Thread.sleep(1000);
        WebElement dayDD=driver.findElement(By.id("day"));
        Select day=new Select(dayDD);
        List<WebElement>allOptions1=day.getOptions();
        day.selectByValue("31");
        Thread.sleep(1000);
        WebElement yearDD=driver.findElement(By.id("year"));
        Select year=new Select(yearDD);
        List<WebElement>allOptions2=year.getOptions();
        year.selectByValue("2001");
        Thread.sleep(1000);
        WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
        Thread.sleep(1000);
        WebElement button=driver.findElement(By.xpath("//button[@name='websubmit']"));
        button.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
