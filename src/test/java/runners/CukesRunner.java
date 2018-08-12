package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		plugin = {"in plugin we have to use path of our reports'html,extends,cucumber reports'"},
		
//		tags = "any tags from feature file",
		features = "/Users/ermekru/eclipse-workspace/Cucumber_Phase3/src/test/resources/features",
		glue = "/Users/ermekru/eclipse-workspace/Cucumber_Phase3/src/test/java/steps" // on the glue we have to put path from step package
//		dryRun ="" // only boolean should be in dryVan 
		)





public class CukesRunner {

	
	
	
}
