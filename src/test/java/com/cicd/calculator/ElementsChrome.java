package com.cicd.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementsChrome extends BasicClassChrome{

    public void testForAddition(int firstnum, int secondnum){
    WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a"));
        element.click();
    WebElement num1 = driver.findElement(By.id("firstValue"));
        num1.clear();
        num1.sendKeys("8");
    WebElement num2 = driver.findElement(By.id("secondValue"));
        num2.clear();
        num2.sendKeys("5");
    WebElement addbutton = driver.findElement(By.xpath("/html/body/div[2]/form/p/input"));
        addbutton.click();

           }
    public void testForSubtraction(int firstnum, int secondnum){

        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a"));
        element.click();
        WebElement num1 = driver.findElement(By.id("firstValue"));
        num1.clear();
        num1.sendKeys("8");
        WebElement num2 = driver.findElement(By.id("secondValue"));
        num2.clear();
        num2.sendKeys("5");
        WebElement subtractbutton = driver.findElement(By.xpath("/html/body/div[2]/form/p/input"));
        subtractbutton.click();
            }
    public void testForMultiplication(int firstnum, int secondnum){

        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/a"));
        element.click();
        WebElement num1 = driver.findElement(By.id("firstValue"));
        num1.clear();
        num1.sendKeys("8");
        WebElement num2 = driver.findElement(By.id("secondValue"));
        num2.clear();
        num2.sendKeys("5");
        WebElement multbutton = driver.findElement(By.xpath("/html/body/div[2]/form/p/input"));
        multbutton.click();

    }
    public void testFordivision(int firstnum, int secondnum){

        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[4]/a"));
        element.click();
        WebElement num1 = driver.findElement(By.id("firstValue"));
        num1.clear();
        num1.sendKeys("80");
        WebElement num2 = driver.findElement(By.id("secondValue"));
        num2.clear();
        num2.sendKeys("5");
        WebElement divbutton = driver.findElement(By.xpath("/html/body/div[2]/form/p/input"));
        divbutton.click();

    }
    public void testCitatCheck(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[5]/a"));
        element.click();

    }
    public void testCampusMolndalLink(){
        WebElement element = driver.findElement(By.cssSelector("body > div:nth-child(3) > p > a"));
        element.click();

    }

}
