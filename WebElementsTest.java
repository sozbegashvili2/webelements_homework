import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import java.io.*;

class WebElementsTest {
   public static void main(String[] args) throws InterruptedException {
       secondTest();
   }

   public static void secondTest() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.get("https://demoqa.com/webtables");
       Thread.sleep(5000);
       WebElement secondRow = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div"));
       WebElement name = secondRow.findElement(By.className("rt-td"));
       WebElement email = secondRow.findElement(By.cssSelector("div:nth-child(4)"));

       if (email.getText() == "cierra@example.com"){
           System.out.print("EQUALS");
       }

        WebElement delete = driver.findElement(By.xpath("//*[@id=\"delete-record-2\"]"));
        delete.click();
   }

   public static void firstTesT() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
       driver.get("https://demoqa.com/webtables");
       Thread.sleep(5000);
       WebElement editButton = driver.findElement(By.xpath("//*[@id=\"edit-record-1\"]"));
       editButton.click();
       WebElement input = driver.findElement(By.id("age"));
       input.click();
       input.clear();
       input.sendKeys("20");
       WebElement submit = driver.findElement(By.id("submit"));
       submit.click();
   }
}