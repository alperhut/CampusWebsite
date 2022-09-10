package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeaturesFiles/_05_PositionOFG.feature"},
        glue = {"StepDefinitions"}

)

public class _05_PositionRunOFG extends AbstractTestNGCucumberTests {
}
