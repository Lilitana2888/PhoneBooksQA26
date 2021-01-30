package com.telran.fw;

import com.telran.model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ContactHelper extends HelperBase{
    
    public ContactHelper(WebDriver driwer) {
        super(driwer);
    }

    public void clickOnAddBtn() {

       // click(By.cssSelector("a[href='/add']"));
        click(By.xpath("//a[@href='/add']"));
    }

    public void fillContactForm(Contact con) {
        type(By.cssSelector("[placeholder='Name']"),con.getName());
        type(By.cssSelector("[placeholder='Last Name']"),con.getSurName());
        type(By.cssSelector("[placeholder='Phone']"),con.getPhone());
        type(By.cssSelector("[placeholder='email']"),con.getEmail());
        type(By.cssSelector("[placeholder='Address']"),con.getAddress());
        type(By.cssSelector("[placeholder='description']"),con.getDescription());
    }

    public void clickSaveBtn() throws InterruptedException {
      // JavascriptExecutor js = (JavascriptExecutor) wd;
       // js.executeScript("window.scrollBy(0,400)");

        WebElement el = wd.findElement(By.xpath("//button[contains(.,'Save')]"));
        Actions actions = new Actions(wd);
        actions.moveToElement(el).perform();
        Thread.sleep(2000);
        actions.click(el);

    //   click(By.xpath("//button[contains(.,'Save')]"));
    }
}
