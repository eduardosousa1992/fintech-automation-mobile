package com.eduardosousa.automacao.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.eduardosousa.automacao.steps",
    tags = "@SmokeTest",
    plugin = {
        "pretty", 
        "html:target/report-html.html", 
        "json:target/report.json",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" // Este cara é o segredo
    },
    monochrome = true,
    snippets = SnippetType.CAMELCASE,
    dryRun = false
)
public class TestRunner {
}