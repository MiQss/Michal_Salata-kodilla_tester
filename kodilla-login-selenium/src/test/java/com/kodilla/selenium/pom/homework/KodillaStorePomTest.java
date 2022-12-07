package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KodillaStorePomTest {

    KodillaStorePom searchPom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new FirefoxDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        searchPom = new KodillaStorePom (driver);
    }

    @Test
    public void test_NoteBook_Search() throws InterruptedException {
        String searchWord = "NoteBook";
        searchPom.search(searchWord);
        Thread.sleep(5000);
        //result = 2
    }
    @Test
    public void test_School_Search() throws InterruptedException {
        String searchWord = "School";
        searchPom.search(searchWord);
        Thread.sleep(5000);
        //result = 1
    }
    @Test
    public void test_Brand_Search() throws InterruptedException {
        String searchWord = "Brand";
        searchPom.search(searchWord);
        Thread.sleep(5000);
        //result = 1
    }
    @Test
    public void test_Business_Search() throws InterruptedException {
        String searchWord = "Business";
        searchPom.search(searchWord);
        Thread.sleep(5000);
        //result = 1
    }
    @Test
    public void test_Gaming_Search() throws InterruptedException {
        String searchWord = "Gaming";
        searchPom.search(searchWord);
        Thread.sleep(5000);
        //result = 1
    }
    @Test
    public void test_Powerful_Search() throws InterruptedException {
        String searchWord = "Powerful";
        searchPom.search(searchWord);
        Thread.sleep(5000);
        //result = 0
    }
    @Test
    public void test_gAmInG_Search() throws InterruptedException {
        String searchWord = "gAmInG";
        searchPom.search(searchWord);
        Thread.sleep(5000);
        //result = 1
    }

    @AfterEach
    public void testDown() {
        searchPom.close();
    }
}
