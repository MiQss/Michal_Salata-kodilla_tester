package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KodillaPomApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\MiQs\\Kodilla\\kodilla-course\\kodilla-login-selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        KodillaLoginPom loginPom = new KodillaLoginPom(driver);
        loginPom.login("test@kodilla.com","haslo");
        driver.close();

    }
}
