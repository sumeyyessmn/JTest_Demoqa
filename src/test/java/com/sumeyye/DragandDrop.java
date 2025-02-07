package com.sumeyye;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragandDrop {
    @Test
    public void test01() throws InterruptedException {
        //genel ayarlar yapıldı
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://demoqa.com/droppable adresine gidildi
        driver.get("https://demoqa.com/droppable");
        //drag and drop elementleri locate edildi
        WebElement dragMe = driver.findElement(By.cssSelector("#draggable"));
        WebElement dropHere = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        // Actions class'ından nesne türetildi ve draganddrop metodu çalıştırıldı
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe,dropHere).build().perform();
        //Dropped yazısı locate edildi
        WebElement dropText = driver.findElement(By.xpath("//p[text()='Dropped!']"));
        String textTo = dropText.getText();
        //Dosyanın hedefe bırakılıp bırakılmadığı doğrulandı
        if(textTo.equals("Dropped!")) {
            System.out.println("PASS: Dosya hedefe beklendigi gibi birakildi");
        }
        else {
            System.out.println("FAILED: Dosya beklendigi gibi hedefe birakilamadi");
        }
        Thread.sleep(1500); //bekleme süresi

        driver.quit(); //tarayıcıyı kapat
    }
}
