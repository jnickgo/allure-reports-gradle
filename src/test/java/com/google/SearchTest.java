package com.google;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SearchTest {

    @DisplayName("Search Test")
    @Description("Simple test that searches for the term Selenide and validates that at least" +
            "one result returns.")
    @Test
    public void searchTestOne() {
        open("https://www.google.com");
        $(By.name("q")).sendKeys("Selenide");
        $(By.name("q")).pressEnter();
        $$("#ires .g").shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
