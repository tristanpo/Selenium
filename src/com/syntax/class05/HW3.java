package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW3 {
    public static String url = "https://www.ebay.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD=driver.findElement(By.id("gh-cat"));
        Select select=new Select(categoriesDD);
        List<WebElement> options=select.getOptions();
        for(WebElement option:options){
            String optionText= option.getText();
            System.out.println(optionText);
        }
        Thread.sleep(1000);
        select.selectByValue("58058");
        Thread.sleep(1000);
        WebElement button= driver.findElement(By.xpath("//input[@id='gh-btn']"));
        button.click();
        Thread.sleep(1000);
        WebElement header=driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
        if(header.isDisplayed()){
            System.out.println("Header is correct");
        }else{
            System.out.println("Header is not correct");
        }
        driver.quit();


    }
}
