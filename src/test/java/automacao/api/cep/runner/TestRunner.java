package automacao.api.cep.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Automação",
        plugin = {"pretty", "summary", "html:build/reports/feature.html", "json:build/reports/feature.json"},
        features = {"src/test/resources/features"},
        glue = {"automacao.api.cep"}
)
public class TestRunner {
}
