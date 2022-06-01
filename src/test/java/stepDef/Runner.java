package stepDef;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features" , glue = {"stepDef"}, 	plugin = { "pretty", "html:target/cucumber-reports.json" },
        monochrome = true)


public class Runner {

}

