package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class action2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
        Set<String> windows = driver.getWindowHandles();   //
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String ChildId = it.next();

        driver.switchTo().window(ChildId);

        System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());

        driver.findElement(By.cssSelector("p[class='im-para red']")).getText();
        String emailId = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);

        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}
