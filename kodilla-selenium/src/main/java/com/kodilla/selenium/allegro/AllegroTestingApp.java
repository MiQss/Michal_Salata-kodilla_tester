package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "c:\\selenium-drivers\\firefox\\geckodriver.exe");    // [1]
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.pl");

       Thread.sleep(5000);

        WebElement okButton = driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]"));
        okButton.submit();
        Thread.sleep(1000);

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")); // [4]
        searchField.sendKeys("Mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")); // [4]
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(10);

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        searchButton.submit();



    }
}
