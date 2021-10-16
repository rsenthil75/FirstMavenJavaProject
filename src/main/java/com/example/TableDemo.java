package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TableDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/java/FirstMavenJavaProject/src/main/webapp/MyWebApp.html");

        WebElement tableData = driver.findElement(By.tagName("table"));

        WebElement dataElement = tableData.findElements(By.tagName("td")).get(4);

        System.out.println(dataElement.getText());

        WebElement dataElement2=  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[1]"));
        System.out.println(dataElement2.getText());

       List<WebElement> dataElements = tableData.findElements(By.tagName("td"));

       for (WebElement element : dataElements ){
           System.out.println("Table data print : "+ element.getText());
       }


        Thread.sleep(1000);

        driver.close();

    }
}
