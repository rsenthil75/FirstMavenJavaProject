package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTextFieldAndButton {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/java/FirstMavenJavaProject/src/main/webapp/MyWebApp.html");

        WebElement firstName= driver.findElement(By.id("fname"));
        firstName.sendKeys("John");
        firstName.sendKeys("1");


        String frstName= firstName.getAttribute("value");
        System.out.println("First Name ="+frstName);

        WebElement lastName= driver.findElement(By.id("lname"));
        lastName.sendKeys("Einstein");

        String lstName= lastName.getAttribute("value");
        System.out.println("Last Name ="+ lstName);

        WebElement okButton = driver.findElement(By.id("btn1"));
        okButton.click();

        WebElement cancelButton = driver.findElement(By.id("btn2"));
        cancelButton.click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text="+alert.getText());
        alert.accept();
        System.out.println("Alert Accepted");


        Thread.sleep(1000);
        driver.close();



    }
}
