package org.example.model;


import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.example.model.MainPageQuestion.accessCoockie;



public class TestQuestion {
    private WebDriver driver;

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(accessCoockie).click();

        MainPageQuestion objMainPageQuestion = new MainPageQuestion(driver);
        objMainPageQuestion.checkTextInQuestionOne();
        objMainPageQuestion.checkTextInQuestionTwo();
        objMainPageQuestion.checkTextInQuestionThree();
        objMainPageQuestion.checkTextInQuestionFour();
        objMainPageQuestion.checkTextInQuestionFive();
        objMainPageQuestion.checkTextInQuestionSix();
        objMainPageQuestion.checkTextInQuestionSeven();
        objMainPageQuestion.checkTextInQuestionEight();
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }

}
