package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class drop2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // //a[@value='BLR']   (//a[@value='MAA'])[2]
//
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       // driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTNR")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.findElement(By.cssSelector("a[class$='ui-state-default ui-state-active']")).click();



        //   inr to ade



//          driver.findElement(By.id("autosuggest")).sendKeys("Ind");
//          Thread.sleep(3000);
//        List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));
//
//        for (WebElement element : options) {
//            if (element.getText().equalsIgnoreCase("India")) {
//                element.click();
//                break;
//            }
//        }



    }
}
