package com.telran.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {

    WebDriver wd;

    public HelperBase(WebDriver driwer) {
        this.wd = driwer;
    }
    public  void type(By locator, String str)
    {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(str);
    }

    public void click(By locator)
    {
        wd.findElement(locator).click();
    }

    public void pause(int millis) throws InterruptedException {

        Thread.sleep(millis);
    }

    public boolean isElementPresent(By locator)
    {
        return  wd.findElements(locator).size()>0;
    }
}
