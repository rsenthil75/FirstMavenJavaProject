package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChkBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/java/FirstMavenJavaProject/src/main/webapp/MyWebApp.html");

        WebElement chkBoxFrSmwlt = driver.findElement(By.id("frsmwlt"));
        chkBoxFrSmwlt.click();
        System.out.println("Check Box = " + chkBoxFrSmwlt.isSelected());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
