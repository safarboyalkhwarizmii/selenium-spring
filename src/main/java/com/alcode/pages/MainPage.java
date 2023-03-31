package com.alcode.pages;

import org.openqa.selenium.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MainPage {
    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;

    public void init() {
        webDriver.navigate().to(appUrl);
    }
}
