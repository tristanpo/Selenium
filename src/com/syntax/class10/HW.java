package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static String url = "https://www.aa.com/homePage.do";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement calender = driver.findElement(By.className("ui-datepicker-trigger"));
        calender.click();

        WebElement nextBtn = driver.findElement(By.xpath("//a[@data-handler='next']"));
        WebElement dMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String dMonthText = dMonth.getText();

        while (!dMonthText.equals("June")) {
            nextBtn.click();
            dMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            dMonthText = dMonth.getText();
            nextBtn = driver.findElement(By.xpath("//a[@data-handler='next']"));

        }
        List<WebElement> departDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement departDates : departDate) {
            if (departDates.getText().equals("8")) {
                departDates.click();
                break;
            }
        }
        WebElement calender2 = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]"));
        calender2.click();
        WebElement nextBtn2 = driver.findElement(By.xpath("//a[@data-handler='next']"));
        WebElement rMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String rMonthText = rMonth.getText();

        while (!rMonthText.equals("July")) {
            nextBtn2.click();
            rMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            rMonthText = rMonth.getText();
            nextBtn = driver.findElement(By.xpath("//a[@data-handler='next']"));
        }
        List<WebElement>returnDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement returnDates:returnDate) {
            if (returnDates.getText().equals("9")) {
                returnDates.click();
                break;
            }


        }
        WebElement destination=driver.findElement(By.xpath("(//input[@name='destinationAirport'])[1]"));
        destination.sendKeys("DEN",Keys.ENTER);

    }
}
