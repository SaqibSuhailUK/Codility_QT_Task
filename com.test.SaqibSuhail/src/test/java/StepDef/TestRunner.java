/**
 * 
 */
package StepDef;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Saqib Suhail
 *
 * 
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",tags= "@start1", glue= {"StepDef"}, monochrome=true,
plugin = {"pretty","json:target/JSONReports/report.json"})
public class TestRunner {

}
