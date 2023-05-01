package com.saucedemo.www.pages;

import com.saucedemo.www.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {


    By productText = By.xpath("//span[@class='title']");
    By actualNoProduct = By.className("inventory_item");


    public String getProductText(String products) {
        return getTextFromElement(productText);
    }

   public boolean numberOfProducts(int expectedNoOfProducts){
       return numberOfProducts(expectedNoOfProducts);
    }
}