package co.com.tcs.linio.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
      features = "src\\test\\resources\\features\\header_america.feature",
        glue = "co.com.tcs.linio.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class HeaderAmerica {
}
