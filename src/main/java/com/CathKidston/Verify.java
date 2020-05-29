package com.CathKidston;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify extends BaseMain{
public void setUP(){
    openBrowser("");
}
public void tearDown(){
    closeBrowser();
}

    public static void main(String[] args) {
      openBrowser("");
        driver.get("https://www.cathkidston.com");

        driver.manage().window().maximize();
       WebElement header =  driver.findElement(By.className("b-main_nav-list"));
        System.out.println(header.findElements(By.tagName("a")).size());
        closeBrowser();



    }

}
