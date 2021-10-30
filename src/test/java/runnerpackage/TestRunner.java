package runnerpackage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//src/test/resources/testscenarios.feature/Tagex.feature
@CucumberOptions(
		features = "src/test/resources/testscenarios.feature/DataTable.feature",glue={"stepdef"},
		plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
				"pretty","usage:target/cucumber-usage.json", 
				"junit:target/cucumber-results.xml"},
		tags={"@smoke,@Regression"},
		monochrome = true		
		)
public class TestRunner {
	
}