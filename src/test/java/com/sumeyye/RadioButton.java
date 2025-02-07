package com.sumeyye;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioButton {
    WebDriver driver;
    @Test
    public void test01(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/radio-button");
        // "Yes" radio butonuna tıklama
        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
        // Seçim sonucunu kontrol etme
        WebElement selectText = driver.findElement(By.xpath("//p[text()='You have selected ']"));
        Assert.assertTrue(selectText.isDisplayed(),"yes selection text display tested");//evet yazısı görüntüleme test edildi
        // "Impressive" radio butonuna tıklama
        WebElement impressiveRadio = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        if(!impressiveRadio.isSelected()){
            impressiveRadio.click();
        }
        // "No" radio butonu devre dışı mı kontrol etme
        WebElement noRadio = driver.findElement(By.xpath("//label[@for='noRadio']"));
        if(noRadio.isEnabled()){ //aktif ise tikla
            noRadio.click();
        }
        else {
            System.out.println("No radio button isn't active"); //buton aktif degil mesaji
        }
    }
}
