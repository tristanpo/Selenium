package SelFinalHw.pages;

import SelFinalHw.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Error extends CommonMethods {
    public WebElement errMessage = driver.findElement(By.id("spanMessage"));
    //span[contains(text(),'Password cannot')]

}
