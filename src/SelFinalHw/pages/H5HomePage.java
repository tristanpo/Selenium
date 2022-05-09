package SelFinalHw.pages;

import SelFinalHw.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class H5HomePage extends CommonMethods {
   public List<WebElement> rowdata=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
   public WebElement delete=driver.findElement(By.xpath("//button[@style='background-color:red']"));
   public WebElement AjaxCall=driver.findElement(By.xpath("//a[text()='AjaxCall']"));


}
