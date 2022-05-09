package SelFinalHw.pages;

import SelFinalHw.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW5Confirm extends CommonMethods {
    public WebElement confirmDelete=driver.findElement(By.xpath("//input[@value='Delete']"));
}
