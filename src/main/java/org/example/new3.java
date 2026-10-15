package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class new3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        driver.findElement(By.xpath("//div[3]//div[3]//button[1]")).click();
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[type='button']")).click();
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();



//        driver.findElement(By.cssSelector("button[css='1']")).click();
//        driver.findElement(By.cssSelector("button[css='2']")).click();
//        driver.findElement(By.cssSelector("button[css='3']")).click();
//        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
//        driver.findElement(By.cssSelector("button[xpath='1']")).click();



    }
}

