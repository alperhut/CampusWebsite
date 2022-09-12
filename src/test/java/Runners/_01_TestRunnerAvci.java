package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeaturesFiles/_06_Attestationss.feature",
                "src/test/java/FeaturesFiles/_11_Locations.feature"},
        glue = {"StepDefinitions"}

)
public class _01_TestRunnerAvci extends AbstractTestNGCucumberTests {

}
