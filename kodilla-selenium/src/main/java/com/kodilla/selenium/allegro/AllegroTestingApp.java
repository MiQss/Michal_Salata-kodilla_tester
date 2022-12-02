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
        driver.get("https://allegro.pl/");

        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]"));
        cookies.click();

        WebElement searchField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/header/div/div/div/div/form/input"));
        searchField.sendKeys("Mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/header/div/div/div/div/form/div[3]/div/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);
        categoryCombo.click();
        categoryCombo.submit();

    }
}
