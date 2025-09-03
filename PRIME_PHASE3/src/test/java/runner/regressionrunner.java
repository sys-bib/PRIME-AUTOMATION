package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/regression-test.feature"},
        glue = {"stepDef"},
        monochrome = true,
        plugin = {"pretty","html:target/report.html"}
)
public class regressionrunner {

}
