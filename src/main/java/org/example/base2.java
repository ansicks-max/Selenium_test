package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class base2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));




        String[] vegetable = {"Cucumber", "Brocolli", "Beetroot", "Carrot", "Cashews"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        addItems(driver,vegetable);
//
    }

    public static void addItems (WebDriver driver,  String[] vegetable) throws InterruptedException {

        int j = 0;


        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {

            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            List vegetableList = Arrays.asList(vegetable);

            if (vegetableList.contains(formattedName)) {


                j++;
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                if (j == vegetable.length) {
                    break;
                }
            }
        }
        driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
        driver.findElement(By.cssSelector("button[type = 'button']")).click();

        driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.cssSelector("button[class = 'promoBtn']")).click();
    }


}
