package com.saucedemo.www.testbase;

import com.saucedemo.www.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "Chrome";
String baseUrl = "https://www.saucedemo.com/";
    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }
        public void openWebPage(){

        }



    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }

   // public static void main(String[] args) {

   // }

}
