package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("");
        WebElement loginButton= driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement error=driver.findElement(By.id("spanMessage"));
        if(error.isDisplayed()){
            System.out.println("Password cannot be empty");
        }

        driver.quit();
    }
}
