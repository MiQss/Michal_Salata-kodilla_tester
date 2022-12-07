package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KodillaStorePomApplication {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\MiQs\\Kodilla\\kodilla-course\\kodilla-login-selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom storePom = new KodillaStorePom(driver);
        storePom.search("NoteBook");
        Thread.sleep(5000);
        driver.close();

    }
}
