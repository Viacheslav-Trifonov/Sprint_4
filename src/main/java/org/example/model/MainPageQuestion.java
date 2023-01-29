package org.example.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class MainPageQuestion {
    private final WebDriver driver;

    static final By accessCoockie = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

    //вопрос 1
    private final By questionOne = By.xpath(".//div[@id='accordion__heading-0']");
    //вопрос 2
    private final By questionTwo = By.xpath(".//div[@id='accordion__heading-1']");
    //вопрос 3
    private final By questionThree = By.xpath(".//div[@id='accordion__heading-2']");
    //вопрос 4
    private final By questionFour = By.xpath(".//div[@id='accordion__heading-3']");
    //вопрос 5
    private final By questionFive = By.xpath(".//div[@id='accordion__heading-4']");
    //вопрос 6
    private final By questionSix = By.xpath(".//div[@id='accordion__heading-5']");
    //вопрос 7
    private final By questionSeven = By.xpath(".//div[@id='accordion__heading-6']");
    //вопрос 8
    private final By questionEight = By.xpath(".//div[@id='accordion__heading-7']");
    //ответ 1
    private final By answerOne = By.xpath(".//div[@aria-labelledby='accordion__heading-0']/p");
    //ответ 2
    private final By answerTwo = By.xpath(".//div[@aria-labelledby='accordion__heading-1']/p");
    //ответ 3
    private final By answerThree = By.xpath(".//div[@aria-labelledby='accordion__heading-2']/p");
    //ответ 4
    private final By answerFour = By.xpath(".//div[@aria-labelledby='accordion__heading-3']/p");
    //ответ 5
    private final By answerFive = By.xpath(".//div[@aria-labelledby='accordion__heading-4']/p");
    //ответ 6
    private final By answerSix = By.xpath(".//div[@aria-labelledby='accordion__heading-5']/p");
    //ответ 7
    private final By answerSeven = By.xpath(".//div[@aria-labelledby='accordion__heading-6']/p");
    //ответ 8
    private final By answerEight = By.xpath(".//div[@aria-labelledby='accordion__heading-7']/p");

    //верный текст 1
    String textOne = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //верный текст 2
    String textTwo = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //верный текст 3
    String textThree = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //верный текст 4
    String textFour = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //верный текст 5
    String textFive = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //верный текст 6
    String textSix = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //верный текст 7
    String textSeven = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //верный текст 8
    String textEight = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";



    public MainPageQuestion(WebDriver driver) {
        this.driver = driver;
    }

    public void checkTextInQuestionOne() {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(questionOne)).click();
        //driver.findElement(questionOne).click();
        String txt1 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(answerOne)).getText();
        assertEquals(txt1, textOne);
    }
    public void checkTextInQuestionTwo() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(questionTwo)).click();
        //driver.findElement(questionTwo).click();
        String txt2 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(answerTwo)).getText();
        assertEquals(txt2, textTwo);
    }
    public void checkTextInQuestionThree() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(questionThree)).click();
        //driver.findElement(questionTwo).click();
        String txt3 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(answerThree)).getText();
        assertEquals(txt3, textThree);
    }
    public void checkTextInQuestionFour() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(questionFour)).click();
        //driver.findElement(questionFour).click();
        String txt4 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(answerFour)).getText();
        assertEquals(txt4, textFour);
    }
    public void checkTextInQuestionFive() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(questionFive)).click();
        //driver.findElement(questionFive).click();
        String txt5 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(answerFive)).getText();
        assertEquals(txt5, textFive);
    }
    public void checkTextInQuestionSix() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(questionSix)).click();
        //driver.findElement(questionTwo).click();
        String txt6 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(answerSix)).getText();
        assertEquals(txt6, textSix);
    }
    public void checkTextInQuestionSeven() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(questionSeven)).click();
        //driver.findElement(questionTwo).click();
        String txt7 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(answerSeven)).getText();
        assertEquals(txt7, textSeven);
    }
    public void checkTextInQuestionEight() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(questionEight)).click();
        //driver.findElement(questionEight).click();
        String txt8 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(answerEight)).getText();
        assertEquals(txt8, textEight);
    }

}


