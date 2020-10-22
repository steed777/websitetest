package com.github.steed777.mvideo;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;


public interface MainPage extends AtlasWebElement{
    @FindBy("//*[@id=\"-category-section\"]")
   AtlasWebElement getButton();
    @FindBy("//*[@id=\"-brand-section\"]")
   AtlasWebElement getFilter();
    @FindBy("//*[@id=\"-monoblock_razreshenie-section\"]")
   AtlasWebElement getDisplay();

}
