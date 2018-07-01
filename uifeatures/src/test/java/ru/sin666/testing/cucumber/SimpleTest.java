package ru.sin666.testing.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(        features = "classpath:features",
        glue = "ru.sin666.testing.cucumber.steps",
        tags = "@withdrawal",
        snippets = SnippetType.CAMELCASE)
public class SimpleTest {

    @Test
    public void justTest(){
        System.out.println("Just test");
    }
}
