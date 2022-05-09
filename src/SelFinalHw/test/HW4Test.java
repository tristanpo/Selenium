package SelFinalHw.test;

import SelFinalHw.pages.Error;
import SelFinalHw.pages.HW2LoginPage;
import SelFinalHw.testBase.BaseClass;

public class HW4Test {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        HW2LoginPage hw2LoginPage=new HW2LoginPage();
        hw2LoginPage.sendText(hw2LoginPage.username, "Admin");
        hw2LoginPage.sendText(hw2LoginPage.password, "wrong");
        hw2LoginPage.loginButton.click();
        Error error=new Error();
        error.getText(error.errMessage);
    }
}
