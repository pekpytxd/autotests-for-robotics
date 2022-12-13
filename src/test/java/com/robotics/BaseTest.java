package com.robotics;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @BeforeEach
    void openBrowser() {
        open("https://robotics.lviv.ua/");
    }
}
