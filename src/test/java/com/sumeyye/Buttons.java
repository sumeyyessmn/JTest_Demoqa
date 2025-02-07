package com.sumeyye;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Buttons {
    @Test
    public void test01() throws InterruptedException {
        //genel ayarlar yapıldı
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //tam ekran yapıldı
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //'https://demoqa.com/buttons' adresine gidildi
        driver.get("https://demoqa.com/buttons");
        //buton elementleri locate edildi
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        WebElement rightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //Actions class'ından nesne türetildi
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).build().perform(); // doubleClickBtn'a çift tıklama işlemi gerçekleştirildi
        Thread.sleep(1500); // bekleme süresi tanımlandı
        actions.contextClick(rightClickBtn).build().perform(); // rightClickBtn elementine sağ tıklama işlemi gerçekleştirildi
        Thread.sleep(1500);
        actions.click(clickMeBtn).build().perform();
        //Double click yaptığımızda beklenen "You have done a double click" yazısı ile gerçekleşen yazının aynı olduğu test edildi
        WebElement doubleText = driver.findElement(By.xpath("//p[text()='You have done a double click']"));
        String actualText = doubleText.getText();
        String expectedText = "You have done a double click";
        Assert.assertEquals(actualText,expectedText);
    }
}
