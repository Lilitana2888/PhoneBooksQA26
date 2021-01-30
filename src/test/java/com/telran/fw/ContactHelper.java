package com.telran.fw;

import com.telran.model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{
    
    public ContactHelper(WebDriver driwer) {
        super(driwer);
    }

    public void clickOnAddBtn() {

        click(By.cssSelector("a[href='/add']"));
    }

    public void fillContactForm(Contact con) {
        type(By.cssSelector("[placeholder='Name']"),con.getName());
        type(By.cssSelector("[placeholder='Last Name']"),con.getLname());
        type(By.cssSelector(""),con.getPhone());
        type(By.cssSelector(""),con.getEmail());
        type(By.cssSelector(""),con.getAddress());
        type(By.cssSelector(""),con.getDescription());
    }
}
