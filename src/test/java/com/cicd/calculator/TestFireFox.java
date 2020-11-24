package com.cicd.calculator;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFireFox extends ElementsFirefox {
    @Test
    public void AtestAdd(){
        testForAddition(8,5);
        int value= Integer.parseInt(driver.findElement(By.xpath("/html/body/div[2]/h3/p")).getText());
        assertEquals(13,value);
        System.out.println("addition is successful");
    }
    @Test
    public void BtestSubtraction(){
        testForSubtraction(8,5);
        int value= Integer.parseInt(driver.findElement(By.xpath("/html/body/div[2]/h3/p")).getText());
        assertEquals(3,value);
        System.out.println("substraction is successful");
    }
    @Test
    public void CtestMultiplication(){
        testForMultiplication(8,5);
        int value= Integer.parseInt(driver.findElement(By.xpath("/html/body/div[2]/h3/p")).getText());
        assertEquals(40,value);
        System.out.println("Multiplication is successful");
    }
    @Test
    public void DtestDivision(){
        testFordivision(80,5);
        double value= Double.parseDouble(driver.findElement(By.xpath("/html/body/div[2]/h3/p")).getText());
        assertEquals(16.0,value);
        System.out.println("Division is successful");
    }
    @Test
    public void EtestCitat(){
        testCitatCheck();
    }
    @Test
    public void FtestLink(){
        testCampusMolndalLink();
    }
}
