package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class action {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.amazon.com/");
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("div[id='nav-link-accountList'] a:nth-child(1)"));


       //  a.moveToElement(driver.findElement(By.cssSelector("input[type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("phone").doubleClick().build().perform();
        a.moveToElement(move).contextClick().build().perform();

    }
}
