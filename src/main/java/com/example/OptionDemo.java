package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/java/FirstMavenJavaProject/src/main/webapp/MyWebApp.html");

        WebElement optionSelect = driver.findElement(By.id("selectTest1"));

        Select slt = new Select(optionSelect);
        slt.selectByVisibleText("New York");

        System.out.println(slt.getFirstSelectedOption().getText());

        Thread.sleep(1000);

        driver.close();


    }
}
