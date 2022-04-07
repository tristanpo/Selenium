package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW {
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement button=driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        button.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement text=driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(text.getText());


        WebElement enableBtn= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableBtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement isEnabled= driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(isEnabled.getText());

        WebElement textBox= driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("Tristan");
        enableBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement isDisabled= driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(isDisabled.getText());

        driver.quit();



    }
}
