package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class fr {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

        WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        for (int i = 1; i <coloumndriver.findElements(By.tagName("a")).size(); i++) {

            String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);

            Thread.sleep(5000L);

            Set<String> abc = driver.getWindowHandles();
            Iterator<String> it = abc.iterator();{
            while(it.hasNext()){
            it.next();

            }
            }
        }
        }

    }


