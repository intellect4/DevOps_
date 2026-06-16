package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class WebPageTest {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://intellect4.github.io/DevOps_/");
    }

    @Test
    public void titleTest() {

        String actual = driver.getTitle();

        String expected = "Webpage Design";



        Assert.assertEquals(actual, expected);

    }

    @AfterTest
    public void closeBrowser() {

        driver.quit();

    }
}