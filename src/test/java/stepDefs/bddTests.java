package stepDefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

//setting the path for the feature file
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/loginSteps"
        , glue = "com.sqs.training.stepdefs")

public class bddTests
{

}
