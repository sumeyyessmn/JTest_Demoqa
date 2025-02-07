package com.sumeyye;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class Checkbox {
    WebDriver driver;
    @Test
    public void test01(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/checkbox");
        WebElement homeChck = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]"));
        homeChck.click();
        SoftAssert softAssert = new SoftAssert();
        WebElement selectText = driver.findElement(By.xpath("//span[@class='text-success']"));
        softAssert.assertTrue(selectText.getText().contains("home"),"home yazisi icerdigini test ettik");

        homeChck.click();
        WebElement expandBtn = driver.findElement(By.xpath("//button[@title='Expand all']"));
        expandBtn.click();
        WebElement desktopChck = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
        desktopChck.click();
        driver.findElement(By.xpath("//button[@title='Collapse all']")).click();
        softAssert.assertAll();
        driver.quit();


    }

}
