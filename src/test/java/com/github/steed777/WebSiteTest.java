package com.github.steed777;

import com.github.steed777.mvideo.MVidioSite;
import com.github.steed777.mvideo.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.core.AtlasException;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.matchers.webdriver.DisplayedMatcher;


//Тестировка фунционала фильтров товара сайта мвидео
public class WebSiteTest {

    private Atlas atlas;
    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        atlas = new Atlas(new WebDriverConfiguration(driver, "https://www.mvideo.ru/product-list"));
    }
//Checkbox цифровая версия игр, после клика checkbox THQ Nordic
    @Test
    public void digitalVersionTHQTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
mainPage.getButton()
        .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[1]/label/span"))
        .click();
    mainPage
            .waitUntil(DisplayedMatcher.displayed(), 5);
            }
        catch (AtlasException e){
            try {
                mainPage.getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[1]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException ex) {

            }
    }
    }
    //Checkbox цифровая версия игр, после клика checkbox Ubisof
    @Test
    public void digitalVersionUbisoftTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
try {
    mainPage
            .getButton()
            .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[1]/label/span"))
            .click();
    mainPage
            .waitUntil(DisplayedMatcher.displayed(), 5);

}catch (AtlasException e){
    try {
        mainPage
                .getFilter()
                .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[2]/label/span"))
                .click();
        mainPage
                .waitUntil(DisplayedMatcher.displayed(), 5);
    }catch (AtlasException exc){

    }
}
    }
    //Checkbox цифровая версия игр, после клика checkbox Disney
    @Test
    public void digitalVersionDisneyTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[1]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[3]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox цифровая версия игр, после клика checkbox Sega
    @Test
    public void digitalVersionSegaTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[1]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[4]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox цифровая версия игр, после клика checkbox Bandai Namco
    @Test
    public void digitalVersionBandaiTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[1]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[5]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox чехлы для телефонов, после клика checkbox Samsung
    @Test
    public void casesForSamsungTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[2]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[1]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox чехлы для телефонов, после клика checkbox RedLine
    @Test
    public void casesForRedLineTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[2]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[2]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox чехлы для телефонов, после клика checkbox InterStep
    @Test
    public void casesForInterStepTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[2]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[3]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox чехлы для телефонов, после клика checkbox Vipe
    @Test
    public void casesForVipeTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[2]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[4]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox чехлы для телефонов, после клика checkbox Huawei
    @Test
    public void casesForHuaweiTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[2]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[5]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox Apple iMac, после клика checkbox блока разрешение экрана 1920х1080
    @Test
    public void appleiMac1920Test(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[3]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getDisplay()
                        .findElement(By.xpath("//*[@id=\"-monoblock_razreshenie-section\"]/div/ul/li[1]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox Apple iMac, после клика checkbox блока разрешение экрана 5120х2880
    @Test
    public void appleiMac5120Test(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[3]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getDisplay()
                        .findElement(By.xpath("//*[@id=\"-monoblock_razreshenie-section\"]/div/ul/li[2]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox Apple iMac, после клика checkbox блока разрешение экрана 4096х2304
    @Test
    public void appleiMac4096Test(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[3]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getDisplay()
                        .findElement(By.xpath("//*[@id=\"-monoblock_razreshenie-section\"]/div/ul/li[3]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    //Checkbox Элетртческие чайники, после клика checkbox Kitfort
    @Test
    public void electricKettlesKitfortTest(){
        MVidioSite mVidioSite = onSite();
        MainPage mainPage = mVidioSite.onMainPage();
        try {
            mainPage
                    .getButton()
                    .findElement(By.xpath("//*[@id=\"-category-section\"]/div/ul/li[4]/label/span"))
                    .click();
            mainPage
                    .waitUntil(DisplayedMatcher.displayed(), 5);

        }catch (AtlasException e){
            try {
                mainPage
                        .getFilter()
                        .findElement(By.xpath("//*[@id=\"-brand-section\"]/div/ul/li[1]/label/span"))
                        .click();
                mainPage
                        .waitUntil(DisplayedMatcher.displayed(), 5);
            }catch (AtlasException exc){

            }
        }
    }
    private MVidioSite onSite() {
        return atlas.create(driver, MVidioSite.class);
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}

