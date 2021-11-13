package kur.alexei.steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import kur.alexei.testData.TestData;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Steps {

    @Step("Go to repository page {repositoryUrl}")
    public void goToRepository( String repositoryUrl) {

        open(repositoryUrl);
    }

    @Step("Find element for issues on page")
    public void findElementIssuesOnRepoPage() {

        $("span[data-content='Issues']").shouldBe(visible, Duration.ofSeconds(5));
    }

    @Step("Check that 'Issues' is name of found element")
    public void elementIssuesShouldBeNamedIssues() {

        $("span[data-content='Issues']").shouldHave(text("Issues"));
    }


}
