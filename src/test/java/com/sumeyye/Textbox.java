package com.sumeyye;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Textbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/text-box");

        WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
        username.sendKeys("Charlie");
        WebElement email = driver.findElement(By.cssSelector("#userEmail"));
        email.sendKeys("charlie78pt@gmail.com");
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("Cecelia Havens\n" +
                "456 White Finch St.\n" +
                "North Augusta, SC 29860");
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("North Augusta");

        WebElement submitbtn = driver.findElement(By.xpath("//button[@id='submit']"));
        submitbtn.click();
        driver.close();
    }
}
