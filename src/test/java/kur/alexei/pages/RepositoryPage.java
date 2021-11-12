package kur.alexei.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class RepositoryPage {

    String issuesTabLocator = "span[data-content=\"Issues\"]";

    public void findElementIssuesOnRepoPage() {

        $(issuesTabLocator).shouldBe(visible);
    }

    public void elementIssuesShouldBeNamedIssues() {
        $(issuesTabLocator).shouldHave(text("Issues"));
    }


}
