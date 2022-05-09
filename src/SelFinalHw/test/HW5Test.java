package SelFinalHw.test;

import SelFinalHw.pages.*;
import SelFinalHw.pages.Error;
import SelFinalHw.testBase.BaseClass;


public class HW5Test {
    public static void main(String[] args) throws InterruptedException {
        BaseClass.openWithSpecificUrl("http://www.uitestpractice.com/");
        HW5DashBoardPage hw5DashBoardPage=new HW5DashBoardPage();
        hw5DashBoardPage.ActionClass(hw5DashBoardPage.draggable, hw5DashBoardPage.droppable);
        hw5DashBoardPage.doubleClick(hw5DashBoardPage.doubleClick);
        hw5DashBoardPage.handleAlert(hw5DashBoardPage.doubleClick);
        hw5DashBoardPage.homebtn.click();
        H5HomePage hw5HomePage=new H5HomePage();
       // hw5HomePage.tableHandling(hw5HomePage.rowdata,"Hrithik",hw5HomePage.delete);
       // HW5Confirm confirm=new HW5Confirm();
       // confirm.confirmDelete.click();
        hw5HomePage.AjaxCall.click();

       HW5AjaxPage ajaxPage= new HW5AjaxPage();
        ajaxPage.switchToFrame("aswift_3");
        ajaxPage.emplcicitWait(ajaxPage.add);
       // ajaxPage.emplcicitWait(ajaxPage.ajaxLink);


        //hw5DashBoardPage.switchToFrame(hw5DashBoardPage.iFrame);
       // hw5DashBoardPage.sendText(hw5DashBoardPage.textBox, "Tristan");
    }
}
