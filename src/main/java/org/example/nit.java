package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nit {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ixigo.com/?utm_source=Brand_Ggl_Search&utm_medium=paid_search_google&utm_campaign=Ixigo_Brand&utm_source=brand_g&utm_medium=paid_search_google&utm_campaign=ixigo_brand&gad_source=1&gad_campaignid=773471927&gbraid=0AAAAAC5edWCb_TeZyC0OCyDtzAN1kWVMG&gclid=CjwKCAiAv5bMBhAIEiwAqP9GuArMFEhPEeJ57AgRuUcRd7DWHIuPv624OlbZI3yI4eeCDGqTmwLd7BoCbDoQAvD_BwE");
        driver.findElement(By.cssSelector("body > main:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("body main div div div div div div:nth-child(1) div:nth-child(3) div:nth-child(2) div:nth-child(1) div:nth-child(2) p:nth-child(1) span:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > main:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1)")).click();
    }
}
