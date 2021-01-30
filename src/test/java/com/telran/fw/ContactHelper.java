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
        type(By.cssSelector("[placeholder='Phone']"),con.getPhone());
        type(By.cssSelector("[placeholder='email']"),con.getEmail());
        type(By.cssSelector("[placeholder='Address']"),con.getAddress());
        type(By.cssSelector("[placeholder='description']"),con.getDescription());
    }

    public void clickSaveBtn() {

        click(By.xpath("//button[.='Save']"));
    }
}
