package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDocuments {
    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement fileUploadLink=driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("this is where you put the file path");
        WebElement uploadButton=driver.findElement(By.id("file-submit"));
        uploadButton.click();
    }
}
