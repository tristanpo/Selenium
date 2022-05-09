package SelFinalHw.test;

import SelFinalHw.pages.HW2LoginPage;
import SelFinalHw.pages.Error;
import SelFinalHw.testBase.BaseClass;

public class HW3Test {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        HW2LoginPage hw2LoginPage=new HW2LoginPage();
        hw2LoginPage.sendText(hw2LoginPage.username, "");
        hw2LoginPage.sendText(hw2LoginPage.password, "");
        hw2LoginPage.loginButton.click();
        Error error=new Error();
        error.getText(error.errMessage);
    }
}
