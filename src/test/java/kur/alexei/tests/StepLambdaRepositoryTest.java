package kur.alexei.tests;

import kur.alexei.pages.BasePage;
import kur.alexei.testData.TestData;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StepLambdaRepositoryTest extends BasePage {

    String repositoryUrl = TestData.repositoryUrl;

    @Test
    public void checkNameIssuesOnRepositoryLambdaTest() {

        step("Go to repository page " + repositoryUrl, () -> {
                    open(repositoryUrl);
                });

        step("Find element for issues on page", () -> {
            $("span[data-content='Issues']").shouldBe(visible, Duration.ofSeconds(5));
        });


        step("Check that 'Issues' is name of found element", () -> {

            $("span[data-content='Issues']").shouldHave(text("Issues"));

        });

        takeScreenshot();

    }

}
