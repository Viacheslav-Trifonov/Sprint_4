package org.example.model;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.Assert.assertFalse;


public class OrderPage {
    private final WebDriver driver;

    static final By accessCoockie = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

    //поле ввода имени
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //поле ввода фамилии
    private final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //поле ввода адреса
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //поле ввода станции метро
    private final By stationField = By.xpath(".//input[@placeholder='* Станция метро']");
    //поле ввода телефона
    private final By phonenumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //кнопка далее
    private final By nextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //поле когда привезти самокат
    private final By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //поле срок аренды
    private final By rentalField = By.xpath(".//div[@class='Dropdown-control']");
    //выбрать срок двое суток
    private final By rentalChoiceOne = By.xpath(".//div[text()='двое суток']");
    //выбрать срок сутки
    private final By rentalChoiceTwo = By.xpath(".//div[text()='сутки']");
    //поле цвет самоката Чёрный
    private final By colorFieldOne = By.xpath(".//label[@for='black']");
    //поле цвет самоката Серый
    private final By colorFieldTwo = By.xpath(".//label[@for='grey']");
    //поле комментарий
    private final By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //кнопка заказать
    private final By buttonOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //кнопка подтвердить заказ
    private final By confirmOrder = By.xpath(".//button[text()='Да']");
    //кнопка посмотреть статус
    private final By statusButton = By.xpath(".//button[text()='Посмотреть статус']");
    //имя 1 набор
    private final String nameOne = "Иван";
    //фамилия 1 набор
    private final String surnameOne = "Петров";
    //адрес 1 набор
    private final String addressOne = "Московское шоссе";
    //телефон 1 набор
    private final String phonenumberOne = "89999999999";
    //дата 1 набор
    private final String dateOne = "01.01.2022";
    //комментарий 1 набор
    private final String commentOne = "комментарий";
    //имя 1 набор
    private final String nameTwo = "Владислав";
    //фамилия 1 набор
    private final String surnameTwo = "Сидоров";
    //адрес 1 набор
    private final String addressTwo = "улица Ленина";
    //телефон 1 набор
    private final String phonenumberTwo = "77777777777";
    //дата 1 набор
    private final String dateTwo = "01.01.2023";
    //комментарий 1 набор
    private final String commentTwo = "комментарий 2 вариант";

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    //ввести имя, фамилию, адресс, метро и телефон
    public void inputOrderDetailsDataSetOne() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(nameOne);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(surnameField)).sendKeys(surnameOne);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(addressField)).sendKeys(addressOne);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(stationField)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(stationField)).sendKeys(Keys.DOWN);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(stationField)).sendKeys(Keys.ENTER);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(phonenumberField)).sendKeys(phonenumberOne);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(nextButton)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(dateField)).sendKeys(dateOne);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(dateField)).sendKeys(Keys.ENTER);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(rentalField)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(rentalChoiceOne)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(colorFieldOne)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(commentField)).sendKeys(commentOne);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(buttonOrder)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(confirmOrder)).click();
        boolean status = new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(statusButton)).isDisplayed();
        assertFalse("Тест провален, всплывающее окно с сообщением об успешном создании заказа не найдено",status);
    }
    public void inputOrderDetailsDataSetTwo() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(nameTwo);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(surnameField)).sendKeys(surnameTwo);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(addressField)).sendKeys(addressTwo);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(stationField)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(stationField)).sendKeys(Keys.DOWN);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(stationField)).sendKeys(Keys.ENTER);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(phonenumberField)).sendKeys(phonenumberTwo);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(nextButton)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(dateField)).sendKeys(dateTwo);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(dateField)).sendKeys(Keys.ENTER);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(rentalField)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(rentalChoiceTwo)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(colorFieldTwo)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(commentField)).sendKeys(commentTwo);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(buttonOrder)).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(confirmOrder)).click();
        boolean status = new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(statusButton)).isDisplayed();
        assertFalse("Тест провален, всплывающее окно с сообщением об успешном создании заказа не найдено", status);
    }


}


