package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeleniumDemo {

    private WebDriver driver;


    @Test
    public void t2() {

        driver = new ChromeDriver();
        driver.get("file:///Users/java/FirstMavenJavaProject/src/main/webapp/MyWebApp.html");


        WebElement dropdown = driver.findElement(By.id("selectTest1"));
        dropdown.findElement(By.xpath("/html/body/form/select[1]/option[2]")).click();
        String value = driver.findElement(By.id("selectTest1")).getAttribute("value");
        assertEquals(value, "St_Louis");


        dropdown = driver.findElement(By.id("selectTest2"));
        dropdown.findElement(By.xpath("/html/body/form/select[2]/option[1]")).click();
        value = driver.findElement(By.id("selectTest2")).getAttribute("value");
        assertEquals(value, "Chennai");


        driver.findElement(By.id("selectTest3"));
        dropdown.findElement(By.xpath("/html/body/form/select[3]/option[2]")).click();
        value = driver.findElement(By.id("selectTest3")).getAttribute("value");
        assertEquals(value, "No");

        driver.close();
    }
}
