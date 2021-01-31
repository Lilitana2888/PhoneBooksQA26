package com.telran.fw;

import com.telran.model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driwer) {
        super(driwer);
    }

    public void clickOnAddBtn() {

        // click(By.cssSelector("a[href='/add']"));
        click(By.xpath("//a[@href='/add']"));
    }

    public void fillContactForm(Contact con) {
        type(By.cssSelector("[placeholder='Name']"), con.getName());
        type(By.cssSelector("[placeholder='Last Name']"), con.getSurName());
        type(By.cssSelector("[placeholder='Phone']"), con.getPhone());
        type(By.cssSelector("[placeholder='email']"), con.getEmail());
        type(By.cssSelector("[placeholder='Address']"), con.getAddress());
        type(By.cssSelector("[placeholder='description']"), con.getDescription());
    }

    public void clickSaveBtn() throws InterruptedException {
        // no work?? JavascriptExecutor js = (JavascriptExecutor) wd;
        // js.executeScript("window.scrollBy(0,400)");

        WebElement el = wd.findElement(By.xpath("//button[contains(.,'Save')]"));
        Actions actions = new Actions(wd);
        actions.moveToElement(el);
        Thread.sleep(2000);
        actions.click(el).perform();

    }

    public void clickContactBtn() {
        click(By.cssSelector("[href='/contacts']"));
    }

    public boolean isNameExist(String name) {
        List<WebElement> elements = wd.findElements(By.cssSelector("h2"));
        for(WebElement el : elements)
        {
           if(el.getText().equals(name))
           {
               return true;
           }
        }
        return false;
    }

}
