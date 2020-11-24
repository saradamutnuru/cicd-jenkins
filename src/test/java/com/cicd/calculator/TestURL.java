package com.cicd.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.Assert;

public class TestURL {
    @Test
    public void testWebsite(){
        System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\bin\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://localhost:8080/add");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a"));
        element.click();
        WebElement num1 = driver.findElement(By.id("firstValue"));
        num1.clear();
        num1.sendKeys("6");
        WebElement num2 = driver.findElement(By.id("secondValue"));
        num2.clear();
        num2.sendKeys("6");
        WebElement addbutton = driver.findElement(By.xpath("/html/body/div[2]/form/p/input"));
        addbutton.click();
        int value= Integer.parseInt(driver.findElement(By.xpath("/html/body/div[2]/h3/p")).getText());
        assertEquals(12,value);
        System.out.println("addition is successful");

        //driver.quit();
    }

}
