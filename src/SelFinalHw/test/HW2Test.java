package SelFinalHw.test;


import SelFinalHw.pages.HW2LoginPage;
import SelFinalHw.pages.Error;
import SelFinalHw.testBase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static SelFinalHw.testBase.BaseClass.driver;

public class HW2Test {
    public static void main(String[] args) {

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        HW2LoginPage hw2LoginPage=new HW2LoginPage();
        hw2LoginPage.sendText(hw2LoginPage.username, "Admin");
        hw2LoginPage.sendText(hw2LoginPage.password,"");
        hw2LoginPage.loginButton.click();
        Error error=new Error();
        error.getText(error.errMessage);


    }
}
