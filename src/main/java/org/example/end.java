package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class end {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.qaclickacademy.com/");
      //  System.out.println(driver.findElements(By.tagName("a")).size());
       WebElement footerdriver = driver.findElement(By.cssSelector("div[class='footer-top pt-40 pb-70']"));
     //   System.out.println(footerdriver.findElements(By.tagName("a")).size());
        footerdriver.findElement(By.cssSelector("div[class='col-lg-3 col-md-6 col-sm-6']"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
    }
}