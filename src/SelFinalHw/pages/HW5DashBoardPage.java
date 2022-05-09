package SelFinalHw.pages;


import SelFinalHw.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW5DashBoardPage extends CommonMethods {
    public WebElement draggable=driver.findElement(By.id("draggable"));
    public WebElement droppable=driver.findElement(By.id("droppable"));
    public WebElement doubleClick=driver.findElement(By.name("dblClick"));
    public WebElement iFrame=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
    public WebElement homebtn=driver.findElement(By.xpath("//a[text()='Home']"));

    //public WebElement textBox=driver.findElement(By.xpath("//label[text()='Enter your name:']//following::input[@id='name']"));
}
