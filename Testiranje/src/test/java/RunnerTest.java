import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/"},
        glue = {"stepdefinitions"},
        plugin = {"pretty","json:target/tests/json/report.json" , "html:target/tests/json/report.html"},
        tags = ("not @Smoke")
)
public class RunnerTest {
}
