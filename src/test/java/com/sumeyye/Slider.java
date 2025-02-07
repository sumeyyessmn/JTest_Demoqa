package com.sumeyye;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Slider {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        //genel ayarlar yapıldı
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //tam ekran yapıldı
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01(){
        //'https://demoqa.com/slider' adresine gidildi
        driver.get("https://demoqa.com/slider");

        WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
        Actions actions = new Actions(driver);
        //slider ın kaydırılmasını, konumunu ayarlıyoruz 25 ten 100 e getirdik
        actions.moveToElement(slider).dragAndDropBy(slider,250,0).build().perform();
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
