package com.github.steed777.mvideo;


import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;



public interface MVidioSite extends WebSite {
    @Page(url = "product-list")
    MainPage onMainPage();
}
