package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "c:\\selenium-drivers\\firefox\\geckodriver.exe");    // [1]
        WebDriver driver = new FirefoxDriver();
        driver.get("https://allegro.pl/");
        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement cookies = driver.findElement(By.cssSelector("button[data-role*=accept-consent]"));
        cookies.click();

        Thread.sleep(1000);

        WebElement searchField = driver.findElement(By.cssSelector("input.msts_pt"));
        searchField.sendKeys("Mavic mini");

        Thread.sleep(1000);

        WebElement categoryCombo = driver.findElement(By.cssSelector("select.mr3m_1"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);
        categoryCombo.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));
        List<WebElement> element = driver.findElements(By.cssSelector("section > article"));

        System.out.println(element.get(3).getText());



    }
}
