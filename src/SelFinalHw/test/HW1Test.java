package SelFinalHw.test;


import SelFinalHw.testBase.BaseClass;


public class HW1Test {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("https://www.google.com/");
        BaseClass.openNewTab("https://www.google.com/");
        BaseClass.pageHandling();
        BaseClass.navigateNewUrl("https://www.amazon.com/ref=nav_logo");

    }
}
