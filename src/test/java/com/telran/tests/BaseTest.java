package com.telran.tests;

import com.telran.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    public  ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp()
    {
        app.start();
    }

    @AfterMethod()
    public void tearDown() throws InterruptedException {
      //  app.pause(4000);
        app.stop();

    }


}
