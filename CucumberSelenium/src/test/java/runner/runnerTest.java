package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@loginEsquema", // escolher test que irá executar
        glue = "steps", //caminho dos passos que criamos
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class runnerTest {


}
