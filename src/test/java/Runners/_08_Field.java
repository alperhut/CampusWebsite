package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeaturesFiles/_08_Field.feature"},
        glue = {"StepDefinitions"}

)
public class _08_Field extends AbstractTestNGCucumberTests {
}