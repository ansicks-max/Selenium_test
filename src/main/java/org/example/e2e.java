package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();

        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.cssSelector("a[class$='ui-state-default ui-state-active']")).click();

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        int i = 1;
        while (i<3) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();





    }
}
