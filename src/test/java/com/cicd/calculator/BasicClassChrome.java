package com.cicd.calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClassChrome {
    static WebDriver driver;
    @BeforeAll
    public static void setUP() {
      //  System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\bin\\\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://localhost:8080/add");
        driver.manage().window().maximize();
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
        System.out.println("All tests executed successfully !!!!!!!!");
    }
}

