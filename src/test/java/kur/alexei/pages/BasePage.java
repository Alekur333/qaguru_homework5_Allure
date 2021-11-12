package kur.alexei.pages;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BasePage {

    @BeforeAll
    public static void beforeTest() {

        Configuration.browserSize="1200x800";

    }
}
