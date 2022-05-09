package SelFinalHw.pages;

import SelFinalHw.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW2LoginPage extends CommonMethods {
    public WebElement username = driver.findElement(By.id("txtUsername"));
    public WebElement password = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));

    //public WebElement errMessage = driver.findElement(By.xpath("//span[contains(text(),'Password cannot')]"));
}
