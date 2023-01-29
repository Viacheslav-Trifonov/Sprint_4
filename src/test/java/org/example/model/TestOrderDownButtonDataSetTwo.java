package org.example.model;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.example.model.MainPageOrder.accessCoockie;


public class TestOrderDownButtonDataSetTwo {
    private WebDriver driver;

    @Test
    public void testDataSetOne() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(accessCoockie).click();

        MainPageOrder objMainPageOrder = new MainPageOrder(driver);
        objMainPageOrder.clickOrderButtonDown();

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.inputOrderDetailsDataSetOne();
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }

}
