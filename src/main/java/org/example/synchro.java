package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class synchro {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
       //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        String [] food = {"Cauliflower", "Tomato", "Mushroom"};
        int j = 0;

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            List vegetableList = Arrays.asList(food);

            if (vegetableList.contains(formattedName)) {


                j++;
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                if (j == food.length) {
                    break;
                }
            }

        }
        driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
        driver.findElement(By.cssSelector("button[type = 'button']")).click();
        //Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter promo code']")));

        driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        //Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[class = 'promoBtn']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
        System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());




    }
}
