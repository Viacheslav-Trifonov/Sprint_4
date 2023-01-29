package org.example.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class MainPageOrder {
    private final WebDriver driver;

    static final By accessCoockie = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

    //кнопка закза вверху
    private final By orderButtonUp = By.xpath(".//button[@class='Button_Button__ra12g']");
    //кнопка заказа внизу
    private final By orderButtonDown = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //

    public MainPageOrder(WebDriver driver) {
        this.driver = driver;
    }
    //нажать на кнопку заказа вверху
    public void clickOrderButtonUp() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(orderButtonUp)).click();

    }
    //нажать на кнопку заказа внизу
    public void clickOrderButtonDown() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(orderButtonDown));
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(orderButtonDown)).click();
    }




}


