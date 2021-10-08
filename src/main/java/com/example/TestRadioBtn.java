package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestRadioBtn {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/java/FirstMavenJavaProject/src/main/webapp/MyWebApp.html");

        List<WebElement>  radioBtns = driver.findElements(By.name("color"));
        radioBtns.get(0).click();

        for (WebElement rBtn : radioBtns){

            if (rBtn.isSelected()) {
                System.out.println(rBtn.getAttribute("value"));
                break;
            }

        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }
}
