package SelFinalHw.utils;


import SelFinalHw.testBase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends BaseClass {

    /**
     * this method will send text to a given element
     *
     * @param element
     * @param text
     */
    public void sendText(WebElement element, String text) {
        // WebDriverWait wait=new WebDriverWait(driver,30);
        // wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(text);
    }

    /**
     * this method will switch to a frame by index
     *
     * @param index
     */
    public void switchToFrame(int index) {
        try {
            driver.switchTo().frame(index);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param name
     */
    public void switchToFrame(String name) {
        try {
            driver.switchTo().frame(name);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    public void switchToFrame(WebElement element) {
        try {
            driver.switchTo().defaultContent();
            driver.switchTo().frame(element);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    public void getText(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.getText().toString();
        System.out.println(element.getText());

    }

    public void ActionClass(WebElement element, WebElement element2) {
        Actions action = new Actions(driver);
        action.clickAndHold(element).moveToElement(element2).release().build().perform();

    }

    public void doubleClick(WebElement element) {
        Actions action = new Actions(driver);
        action.doubleClick(element).perform();
    }

    public void handleAlert(WebElement element) {
        driver.switchTo().alert().accept();
    }

    public void tableHandling(List<WebElement> element, String text,WebElement element2) {
        for (int i = 1; i < element.size(); i++) {
            String rowText = element.get(i).getText();

            if (rowText.contains(text)) {
                element2.click();
                break;
            }
        }
    }
    public void emplcicitWait(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}