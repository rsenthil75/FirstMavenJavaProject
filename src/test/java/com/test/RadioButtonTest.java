package com.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioButtonTest {

    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.out.println("Setup Executed");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test execution completed");
        driver.close();
    }

    @Test
    public void t1() {

        driver.get("file:///Users/java/FirstMavenJavaProject/src/main/webapp/MyWebApp.html");
        String expectedVale = "Red";
        String actualValue = null;

        List<WebElement> radioBtns = driver.findElements(By.name("color"));
        radioBtns.get(0).click();

        for (WebElement rBtn : radioBtns) {
            if (rBtn.isSelected())
                actualValue = rBtn.getAttribute("value");
        }
        assertEquals(expectedVale, actualValue);
    }
}
