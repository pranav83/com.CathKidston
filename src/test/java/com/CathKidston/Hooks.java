package com.CathKidston;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseMain
{


    @Before
    public void setUp()
    {
        openBrowser("FireFox");
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
